import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OccurencesTest {
    Occurences occurences;
    @Before
    public void setUp() throws Exception {
        occurences = new Occurences();
    }

    @After
    public void tearDown() throws Exception {
        occurences=null;
    }

    @Test
    public void occurencesstring() {
        Map<String,Integer> map = new HashMap<>();
        String string = "one one -one___two,,three,one @three*one?two";
        map.put("one",5);
        map.put("two",2);
        map.put("three",2);
        assertEquals(map,occurences.occurencesstring(string));
//        System.out.println(occurences.occurencesstring(string));
    }
}