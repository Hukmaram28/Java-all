import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UpdateArrayTest {
        UpdateArray updateArray;
        ArrayList<String> arrayList;
    @org.junit.Before
    public void setUp() throws Exception {
        updateArray = new UpdateArray();
        arrayList = new ArrayList<String>();
        arrayList.add("mango");
        arrayList.add("apple");
        arrayList.add("orange");
        arrayList.add("papaya");
    }

    @org.junit.After
    public void tearDown() throws Exception {
        arrayList = null;
        updateArray=null;
    }

    @org.junit.Test
    public void update() {
        ArrayList<String> expectedarraylist = new ArrayList<String>();
        expectedarraylist.add("mango1");
        expectedarraylist.add("apple");
        expectedarraylist.add("orange1");
        expectedarraylist.add("papaya1");
        arrayList = updateArray.update(arrayList,"mango1",0);
        arrayList = updateArray.update(arrayList,"orange1",2);
        arrayList = updateArray.update(arrayList,"papaya1",3);
        assertEquals(expectedarraylist,arrayList);
        arrayList.clear();
    }

    @org.junit.Test
    public void empty() {
        ArrayList<String> expectedarraylist = new ArrayList<String>();
        updateArray.empty(arrayList);
        assertEquals(arrayList,expectedarraylist);
    }
}