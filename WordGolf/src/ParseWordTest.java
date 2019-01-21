import org.junit.Test;
import static org.junit.Assert.*;

public class ParseWordTest {

    @Test public void java() {
        assertEquals(10, Main.parseWord("java"));
    }
    @Test public void google() {
        assertEquals(20, Main.parseWord("google"));
    }
    @Test public void help() {
        assertEquals(6, Main.parseWord("help"));
    }
    @Test public void apcs() {
        assertEquals(5, Main.parseWord("apcs"));
    }
    @Test public void testing() {
        assertEquals(14, Main.parseWord("testing"));
    }
    @Test public void computer() {
        assertEquals(27, Main.parseWord("computer"));
    }
    @Test public void science() {
        assertEquals(28, Main.parseWord("science"));
    }
    @Test public void rumpelstiltskin() {
        assertEquals(69, Main.parseWord("rumpelstiltskin"));
    }

}


