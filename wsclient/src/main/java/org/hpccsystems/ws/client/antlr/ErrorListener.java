package org.hpccsystems.ws.client.antlr;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.InputMismatchException;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.LexerNoViableAltException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.hpccsystems.ws.client.antlr.EclRecordReader;

public class ErrorListener extends BaseErrorListener
{

    private EclRecordReader     parent;
    private ErrorStrategy errorHandler = new ErrorStrategy();
    List<String> errors=new ArrayList<String>();

    // *************************************************************
    // * Attaching to a parser or lexer
    // *************************************************************

    public void attach(Parser parser)
    {
        errors.clear();
        parser.removeErrorListeners();
        parser.addErrorListener(this);
        parser.setErrorHandler(errorHandler);
    }

    public void attach(Lexer lexer)
    {
        lexer.removeErrorListeners();
        lexer.addErrorListener(this);
    }

    // *************************************************************
    // * Errors section
    // *************************************************************

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
            String msg, RecognitionException e)
    {
        if (e != null)
        {
            msg = getErrorMessage(recognizer, e,line,charPositionInLine,offendingSymbol);
        }
        
        errors.add(msg);
    }

    public List<String> getErrors() {
        return errors;
    }
    public void setParent(EclRecordReader r)
    {
        this.parent = r;
    }

    private String getErrorMessage(Recognizer<?, ?> recognizer, RecognitionException e, int line, int charPositionInLine, Object offendingSymbol)
    {
        String msg = "GENERAL_PARSE_ERROR";
       
        if (e instanceof InputMismatchException)
        {
            InputMismatchException ime = (InputMismatchException) e;
            String expected = ime.getExpectedTokens().toString(recognizer.getVocabulary());
            msg = "MISMATCHED_TOKEN " + e.getOffendingToken().getText() + " , expected one of " + expected;
        }
        else if (e instanceof NoViableAltException)
        {
            msg = "NO_PARSE_ALTERNATIVE," + getTokenErrorDisplay(e.getOffendingToken());
        }
        else if (e instanceof LexerNoViableAltException)
        {
            msg = "NO_PARSE_ALTERNATIVE," + getTokenErrorDisplay(e.getOffendingToken());
        }
        else if (e instanceof FailedPredicateException)
        {
            FailedPredicateException fpe = (FailedPredicateException) e;
            msg = "FAILED_PARSE_PREDICATE," + recognizer.getRuleNames()[fpe.getRuleIndex()] + "," + fpe.getPredicate();
        }
        else
        {
            msg = "GENERAL_PARSE_ERROR," + e.getMessage();
        }
        String loc = "";
        if (e.getOffendingToken() != null)
        {
            loc = " at line " + e.getOffendingToken().getLine() + ", char " + e.getOffendingToken().getCharPositionInLine() + "-"
                    + e.getOffendingToken().getCharPositionInLine()
                    + (e.getOffendingToken().getStopIndex() - e.getOffendingToken().getStartIndex()) ;
            
        } else {
            loc=" at line " + line + ", char " + charPositionInLine;
        }
        msg=msg + loc;
        return msg;
    }

    private String getTokenErrorDisplay(Token t)
    {
        if (t == null) return "<no token>";
        String s = t.getText();
        if (s == null)
        {
            if (t.getType() == Token.EOF)
            {
                return "<EOF>";
            }
            else
            {
                return "<" + t.getType() + ">";
            }
        }
        s = s.replace("\n", "\\n");
        s = s.replace("\r", "\\r");
        s = s.replace("\t", "\\t");
        return "'" + s + "'";
    }
}
