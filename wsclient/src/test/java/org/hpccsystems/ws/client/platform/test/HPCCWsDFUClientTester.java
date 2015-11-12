package org.hpccsystems.ws.client.platform.test;

import static org.junit.Assert.*;
import org.hpccsystems.ws.client.HPCCWsDFUClient;
import org.hpccsystems.ws.client.platform.DFUFileDetailInfo;
import org.hpccsystems.ws.client.platform.Platform;
import org.junit.Test;

public class HPCCWsDFUClientTester
{
    @Test
    public void testGetFileDetails() throws Exception
    {
        try
        {
            Platform platform = Platform.get("http", "10.241.100.159", 8010, "dleed", "password");
            HPCCWsDFUClient dfu = platform.getWsDfuClient();
            dfu.setVerbose(true);
            DFUFileDetailInfo info=dfu.getFileDetails("~thor_ramps::dt_yourname::originalpersonfullnamecsv",null);
            String type=info.getFileType().toString();
            assertEquals(type,"CSV");
        } catch (Exception e) {
            fail("Getting file type for ~thor_ramps::dt_yourname::originalpersonfullnamecsv failed");
            e.printStackTrace();
        }
    }
        
}
