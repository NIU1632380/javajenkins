import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void testHelloWorld() {
        assertEquals("Hello, world!", HelloWorld.getMessage());
    }
}
