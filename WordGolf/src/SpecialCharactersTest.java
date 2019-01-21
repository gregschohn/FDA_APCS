import org.junit.Test;
import static org.junit.Assert.*;

public class SpecialCharactersTest {

    @Test public void JAVA() {
        assertEquals( 10, Main.parseSentence("JAVA"));
    }
    @Test public void Google() {
        assertEquals(20, Main.parseSentence("Google"));
    }
    @Test public void APCS() {
        assertEquals(5, Main.parseSentence("APCS"));
    }
    @Test public void MixedCasing1() {
        assertEquals(44, Main.parseSentence("Casing should not matter"));
    }
    @Test public void MixedCasing2() {
        assertEquals(44, Main.parseSentence("CaSiNg SHOuld NoT mATTeR"));
    }
    @Test public void Apostrophe() {
        assertEquals(92, Main.parseSentence("Special characters shouldn't matter"));
    }
    @Test public void Symbols() {
        assertEquals(92 , Main.parseSentence("Spe%%%%cial! chara####cters! shou__ldn't ---matter$$$"));
    }
}
