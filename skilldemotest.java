import static org.junit.Assert.*;
import org.junit.*;

public class skilldemotest {
    @Test
    public void testIsSame(){
        assertEquals(true, skilldemo.isSame("not the same"));
    }
}
