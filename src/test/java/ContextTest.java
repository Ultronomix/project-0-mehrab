import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContextTest {
    @Test
    public void givenArgsNMehrabThenExpectMehrab() {
        String[] testArgs = {"-n", "Mehrab"};
        Context context = new Context(testArgs);
        String expected = "Mehrab";
        String actual = context.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void givenNoArgsThenExpectWorld() {
        String[] testArgs = {};
        Context context = new Context(testArgs);
        assertEquals("World", context.getName());
    }
}
