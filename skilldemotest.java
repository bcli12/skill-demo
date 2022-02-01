import static org.junit.Assert.*;
import org.junit.*;

public class skilldemotest {
    @Test
    public void testIsSame(){
        assertEquals(false, skilldemo.isSame("not the same"));
    }
}
