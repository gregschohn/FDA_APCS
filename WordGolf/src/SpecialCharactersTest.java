import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialCharactersTest {

    @Test public void SE1() {
        assertEquals("JAVA", 10, Main.parseSentence("JAVA"));
    }
    @Test public void SE2() {
        assertEquals("Google", 20, Main.parseSentence("Google"));
    }
    @Test public void SE3() {
        assertEquals("APCS", 5, Main.parseSentence("APCS"));
    }
    @Test public void SE4() {
        assertEquals("MixedCasing1", 44, Main.parseSentence("Casing should not matter"));
    }
    @Test public void SE5() {
        assertEquals("Google", 20, Main.parseSentence("Google"));
        assertEquals("MixedCasing2", 44, Main.parseSentence("CaSiNg SHOuld NoT mATTeR"));
        assertEquals("Google", 20, Main.parseSentence("Google"));
    }
    @Test public void SE6() {
        assertEquals("Apostrophe", 92, Main.parseSentence("Special characters shouldn't matter"));
    }
    @Test public void SE7() {
        assertEquals("Symbols", 92 , Main.parseSentence("Spe%%%%cial! chara####cters! shou__ldn't ---matter$$$"));
    }
}
