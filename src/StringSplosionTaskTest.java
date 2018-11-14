import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringSplosionTaskTest {

    @Test
    void stringSplosion() {
        StringSplosionTask text = new StringSplosionTask();
        assertEquals("CCoCodCode", text.stringSplosion("Code"));
        assertEquals("aababc", text.stringSplosion("abc"));
        assertEquals("aab", text.stringSplosion("ab"));
    }
}