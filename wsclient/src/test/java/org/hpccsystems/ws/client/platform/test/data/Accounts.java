package org.hpccsystems.ws.client.platform.test.data;

public class Accounts
{
    public final static int recLen = -1;

    public final static String elcLayout = 
            "Layout_Accounts := RECORD "
            +"UNSIGNED INTEGER8 PersonID;"
            +"STRING8 ReportDate;"
            +"STRING2 IndustryCode;"
            +"UNSIGNED4 Member;"
            +"STRING8 OpenDate;"
            +"STRING1 TradeType;"
            +"STRING1 TradeRate;"
            +"UNSIGNED1 Narr1;"
            +"UNSIGNED1 Narr2;"
            +"UNSIGNED4 HighCredit;"
            +"UNSIGNED4 Balance;"
            +"UNSIGNED2 Terms;"
            +"UNSIGNED1 TermTypeR;"
            +"STRING20 AccountNumber;"
            +"STRING8 LastActivityDate;"
            +"UNSIGNED1 Late30Day;"
            +"UNSIGNED1 Late60Day;"
            +"UNSIGNED1 Late90Day;"
            +"STRING1 TermType;"
            +"END;\n";

    public final static String data = "9108218085885411565,20000101,ZZ,2121728,19990901,O,9,101,0,9999999,438,0,0,SEARS 9999 -99999999,19990901,0,0,0,S"
                                    +"2454818069645923666,20001201,FZ,28868655,20000801,I,0,88,0,1313,1329,0,0,27489999999999999,20001101,0,0,0,"
                                    +"2454818069645923666,20001201,FZ,28868655,19990801,I,0,88,0,533,1145,0,0,27489999999999999,20001101,0,0,0,"
                                    +"2454818069645923666,20001201,FZ,28868655,19990801,I,0,88,0,780,1560,0,0,27489999999999999,20001101,0,0,0,"
                                    +"2454818069645923666,20001201,FZ,28868655,19990201,I,0,88,0,331,371,0,0,27489999999999999,20001101,0,0,0,"
                                    +"2454818069645923666,20001201,FZ,28868655,19990201,I,0,88,0,982,982,0,0,27489999999999999,20001101,0,0,0,"
                                    +"2454818069645923666,20001101,FC,157905,19981201,I,1,214,0,2800,0,165,2,7217999999,19990901,0,0,0,N"
                                    +"2454818069645923666,20001001,BB,594148,19990901,I,1,214,0,23089,19477,458,2,20019999999,20001001,0,0,0,N"
                                    +"2454818069645923666,20000701,FZ,11564684,19990801,I,0,123,248,1560,0,120,1,27489999999,20000601,0,0,0,M"
                                    +"2454818069645923666,20000701,FZ,11564684,19990201,I,*,123,248,1964,0,120,1,27489999999,,0,0,0,M"
                                    +"2454818069645923666,20000601,FZ,11564684,19990801,I,0,88,0,1065,9999999,120,1,27489999999,20000601,0,0,0,M"
                                    +"2454818069645923666,20000501,FZ,11564684,19990201,I,0,88,0,0,9999999,120,1,274899999B,20000501,0,0,0,M"
                                    +"2454818069645923666,20000501,FZ,11564684,19990201,I,0,88,0,0,9999999,120,1,274899999A,20000501,0,0,0,M"
                                    +"6512705660523829539,20001101,ON,8302668,20000701,R,1,2,233,5000,2080,38,2,5491999999999999,20001101,0,0,0,N"
                                    +"9193989543268753887,20001201,FS,363906,19980301,I,1,127,150,70859,66424,638,2,1195999,20001201,0,0,0,N"
                                    +"484768759680234166,20001001,FC,5176901,19940701,I,9,67,0,474,474,0,0,246599999,19940701,0,0,0,"
                                    +"484768759680234166,20001001,FC,5176901,19950501,I,9,67,0,0,0,48,1,246599999,19950501,0,0,0,M"
                                    +"484768759680234166,20001201,DC,1995404,19941201,R,1,65,229,0,0,0,0,101099999999,19950501,1,0,0,"
                                    +"484768759680234166,20001101,DC,15376613,19940201,R,9,67,229,40,33,33,2,188399999999,19950201,0,0,0,N"
                                    +"484768759680234166,20001101,DC,15376613,19940201,R,9,67,229,210,203,203,2,188399999999,19950201,0,0,0,N"
                                    +"484768759680234166,20001101,DC,1904404,19941201,R,1,65,229,0,0,0,0,730799999999,19950501,1,1,1,"
                                    +"484768759680234166,20001101,FC,20660,19940701,R,9,67,2,615,615,0,0,5425999999999999,19951001,2,1,1,"
                                    +"484768759680234166,20001101,CS,29609667,19950601,R,9,67,229,241,241,10,2,456999999,19950601,0,0,0,N"
                                    +"484768759680234166,20001101,FC,6760901,19940701,R,9,67,2,520,520,0,0,4302999999999999,19951201,0,0,0,"
                                    +"484768759680234166,20000901,DC,807404,19931001,,Z,220,229,2049,0,0,0,26839999,19950501,0,0,0,"
                                    +"484768759680234166,20000901,BB,33304655,19941201,I,9,67,0,8424,7244,66,1,845699999,19950701,0,0,0,M"
                                    +"484768759680234166,20000201,FA,737155,19970801,I,1,158,214,13892,0,231,2,1006999,20000201,0,0,0,N"
                                    +"484768759680234166,19990601,FY,48683,,O,5,57,0,2516,3249,0,0,PURC-999999999999999,19960501,0,0,0,"
                                    +"484768759680234166,19990601,HT,354444,19950801,R,9,67,229,0,1125,0,0,7001999999999999,19961001,0,0,1,"
                                    +"484768759680234166,19990301,BB,21879163,19930901,R,9,67,65,500,650,650,2,5437999999999999,19950801,1,1,3,N"
                                    +"484768759680234166,19981001,FF,3555404,19970601,,Z,229,0,0,0,0,0,11-199999999999,19971201,1,1,4,"
                                    +"484768759680234166,19980501,BB,3747155,19951101,R,9,67,2,2000,2516,106,2,6011999999999999,19960101,1,1,4,N"
                                    +"484768759680234166,19960401,FC,5176901,19940701,I,9,67,0,474,0,15,2,24659999,19960401,1,0,2,N"
                                    +"484768759680234166,19960401,FC,5176901,19950501,I,9,67,0,4807,0,130,2,24659999,19960401,2,1,3,N"
                                    +"484768759680234166,19960201,FP,96924491,19931201,R,1,158,229,0,0,0,0,644-99999999,19950601,4,0,0,"
                                    +"484768759680234166,19950101,FA,34906,19930801,I,1,214,0,7678,0,161,2,98-0999-99999,19941101,0,0,0,N"
                                    +"484768759680234166,19950101,BB,33304655,19941101,I,0,158,0,9320,0,66,1,845499999,19950101,0,0,0,M"
                                    +"484768759680234166,19941201,FP,46845491,19931201,R,1,123,233,300,0,25,2,650-99999999,19941201,0,0,0,N"
                                    +"484768759680234166,19940301,FP,46845491,19931201,R,0,229,0,500,0,0,0,650-99999999,19940201,0,0,0,"
                                    +"16156125023194932930,20001201,BB,27221155,19910501,R,1,168,233,7500,2544,0,0,6011999999999999,20001201,0,0,0,"
                                    +"16156125023194932930,20001101,BB,1220148,20000901,I,1,0,0,31262,30369,674,2,I000999999999999,20001101,0,0,0,N"
                                    +"16156125023194932930,20001201,BB,1498850,20001201,R,0,2,0,9000,9000,270,2,5291999999999999,20001201,0,0,0,N"
                                    +"16156125023194932930,20001101,ON,1869168,19931101,R,1,168,2,7000,4150,104,2,4436999999999999,20001101,0,0,0,N"
                                    +"16156125023194932930,20001201,DC,9336645,19781101,R,1,229,233,9030,0,0,0,5080999999999,20001201,0,0,0,"
                                    +"16156125023194932930,20001101,BB,27379901,19930901,R,1,2,233,8300,772,0,0,4445999999999999,20001101,0,0,0,"
                                    +"16156125023194932930,20001101,FM,10912782,19861201,I,1,218,127,60000,32816,515,2,1731999999999,20001101,0,0,0,N"
                                    +"16156125023194932930,20001101,ON,333217,19900501,R,1,233,0,9999999,5258,0,0,4492999999999999,20001101,0,0,0,"
                                    +"16156125023194932930,20001201,CS,19901,20000401,I,1,158,233,0,0,6,1,2429999999,20001101,0,0,0,M"
                                    +"16156125023194932930,20001201,CS,19901,19820301,R,1,229,233,7000,0,0,0,2429999999,20001101,0,0,0,"
                                    +"16156125023194932930,20001201,ON,630801,19940701,R,1,2,233,24800,7996,137,2,4313999999999999,20001201,0,0,0,N"
                                    +"16156125023194932930,20001101,FF,3555404,19780501,R,1,229,233,2600,0,0,0,636699999,20000901,0,0,0,"
                                    +"16156125023194932930,20001001,ON,2941458,19940201,R,1,2,233,17500,1046,26,2,4417999999999999,20001001,0,0,0,N"
                                    +"16156125023194932930,20001001,BB,17404152,19940801,R,1,2,233,9000,7412,142,2,4266999999999999,20001001,0,0,0,N"
                                    +"16156125023194932930,20001001,ON,2941458,19970501,R,1,2,233,17000,2132,53,2,4417999999999999,20001001,0,0,0,N"
                                    +"16156125023194932930,20001001,BB,8003404,19941001,R,1,73,233,10000,4120,83,2,2502999999,20001001,0,0,0,N"
                                    +"16156125023194932930,20001001,BB,5763426,19941001,R,1,2,233,5000,2747,36,2,5369999999999999,20001001,0,0,0,N"
                                    +"16156125023194932930,20001001,BB,594148,19980401,,A,214,0,24202,0,607,2,20009999999,20000901,0,0,0,N"
                                    +"16156125023194932930,20000301,BB,5763426,19941001,,B,2,233,3500,0,0,0,5369999999999999,19990601,0,0,0,"
                                    +"16156125023194932930,20000301,BB,19695163,19960301,R,1,158,2,5000,0,0,0,5401999999999999,19990101,0,0,0,"
                                    +"16156125023194932930,20000201,BB,636636,19980601,I,1,158,214,5575,0,36,1,6000999999,20000101,0,0,0,M"
                                    +"16156125023194932930,19990701,BB,74496,19930801,R,1,66,2,7000,0,0,0,5491999999999999,19971101,0,0,0,"
                                    +"16156125023194932930,19990401,BB,1790636,19970801,I,1,0,0,12090,9999999,303,2,10009999999999999,19990101,0,0,0,N";

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

    }

}
