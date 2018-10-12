import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class Morethan2Test {
    Morethan2 morethan2;
    @Before
    public void setUp() throws Exception {
        morethan2 = new Morethan2();
    }

    @After
    public void tearDown() throws Exception {
        morethan2 = null;
    }

    @Test
    public void check() {
        Map<String,Boolean> map = new HashMap<>();
        map.put("a",true);
        map.put("b",false);
        map.put("c",true);
        map.put("d",false);
        String string[]={"a","b","c","d","a","c","c"};
        assertEquals(map,morethan2.check(string));
    }
}