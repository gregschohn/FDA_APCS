import org.junit.Test;
import static org.junit.Assert.*;

public class ParseWordTest {

    @Test public void parseWord1() {
        assertEquals("Parsing the word 'java' returned incorrect number", 10, Main.parseWord("java"));
    }
    @Test public void parseWord3() {
        assertEquals("Parsing the word 'google' returned incorrect number", 20, Main.parseWord("google"));
    }
    @Test public void parseWord4() {
        assertEquals("Parsing the word 'help' returned incorrect number", 6, Main.parseWord("help"));
    }
    @Test public void parseWord5() {
        assertEquals("Parsing the word 'apcs' returned incorrect number", 5, Main.parseWord("apcs"));
    }
    @Test public void parseWord6() {
        assertEquals("Parsing the word 'testing' returned incorrect number", 14, Main.parseWord("testing"));
    }
    @Test public void parseWord7() {
        assertEquals("Parsing the word 'computer' returned incorrect number", 27, Main.parseWord("computer"));
    }
    @Test public void parseWord8() {
        assertEquals("Parsing the word 'science' returned incorrect number", 28, Main.parseWord("science"));
    }
    @Test public void parseWord9() {
        assertEquals("Parsing the word 'rumpelstiltskin' returned incorrect number", 69, Main.parseWord("rumpelstiltskin"));
    }

}


