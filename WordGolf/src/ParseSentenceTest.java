import org.junit.Test;
import static org.junit.Assert.*;

public class ParseSentenceTest {

    @Test public void parseSentence1() {
        assertEquals("hello world", 19, Main.parseSentence("hello world"));
    }
    @Test public void parseSentence2() {
        assertEquals("the owls are not what they seem", 45, Main.parseSentence("the owls are not what they seem"));
    }
    @Test public void parseSentence3() {
        assertEquals("i love computer science", 67, Main.parseSentence("i love computer science"));
    }
    @Test public void parseSentence4() {
        assertEquals("but not apple", 20, Main.parseSentence("but not apple"));
    }
    @Test public void parseSentence5() {
        assertEquals("help", 6, Main.parseSentence("help"));
    }
}