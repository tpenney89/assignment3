package tpenney;

import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

public class GenericContainerTest {
    GenericContainer<String> myContainer = new GenericContainer<String>("Tom");

    @Test
    public void testGenericContainerContrsutction(){
        assertNotNull("testContainerConstruction failed", myContainer);
    }

    @Test
    public void getContainerValue(){
        assertEquals("Verify value is assigned correctly","Tom",myContainer.getValue());
    }


}
