import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LinkedListTests {

    @Test
    public void testConstructor() {
        LinkedList list = new LinkedList();
        assertEquals("", list.toString());
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        assertEquals("1 2 3 ", list.toString());
    }

}
