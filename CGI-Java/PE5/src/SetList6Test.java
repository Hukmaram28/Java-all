import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class SetList6Test {
    SetList6 setList6;
    @Before
    public void setUp() throws Exception {
        setList6=new SetList6();
    }

    @After
    public void tearDown() throws Exception {
        setList6=null;
    }

    @Test
    public void sort() {
        Set<String> set=new HashSet<>();
        set.add("Harry");set.add("Olive");
        set.add("Alice");set.add("Bluto");
        set.add("Eugene");
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Alice");arrayList1.add("Bluto");
        arrayList1.add("Eugene");arrayList1.add("Harry");
        arrayList1.add("Olive");
        assertEquals(arrayList1,setList6.sort(set));
    }
}
