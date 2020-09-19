package tpenney;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GenericHashMapTest {
    GenericHashMap<Integer,String> myHashMap = new GenericHashMap<Integer, String>(1,"Tom");

    @Test
    public void testGenericHashMapContsrutction(){
        assertNotNull("testGenericHashMapContsrutction failed", myHashMap);
    }

    @Test
    public void getHashMapKey(){
        assertNotNull("Verify key is assigned",myHashMap.getKey());
    }

    @Test
    public void getCHashMapValue(){
        assertEquals("Verify value is assigned correctly","Tom",myHashMap.getValue());
    }
}
