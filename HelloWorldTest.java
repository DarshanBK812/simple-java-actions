import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    @Test
    void testMainRuns() {
        // This will pass if main() executes without throwing
        HelloWorld.main(new String[]{});
    }
}
