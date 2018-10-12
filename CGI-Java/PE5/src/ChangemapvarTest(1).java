import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

        public class ChangemapvarTest {
        Changemapvar changemapvar;
        @Before
        public void setUp() throws Exception {
            changemapvar=new Changemapvar();
        }

        @After
        public void tearDown() throws Exception {
            changemapvar=null;
        }

        @Test
        public void modifyMap() {
            HashMap<String,String> map=new HashMap<>();
            map.put("val1","java");
            map.put("val2","mars");
            HashMap<String,String> map2=new HashMap<>();
            map2.put("val1"," ");
            map2.put("val2","java");
            assertEquals(map,changemapvar.modifyMap(map));
            map.remove("val1");
            assertEquals(map,changemapvar.modifyMap(map));
        }
    }


