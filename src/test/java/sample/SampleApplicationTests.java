package sample;

import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SampleApplicationTests {

    @Test
    void contextLoads() throws Exception {
        String text = tapSystemOut(() -> SampleApplication.main(new String[0]));
        assertEquals("Hello, World!", text.trim());
    }

}
