import org.junit.Test;
import static org.junit.Assert.*;

public class ParseSentenceTest {

    @Test public void hello_world() {
        assertEquals(19, Main.parseSentence("hello world"));
    }
    @Test public void the_owls_are_not_what_they_seem() {
        assertEquals(45, Main.parseSentence("the owls are not what they seem"));
    }
    @Test public void i_love_computer_science() {
        assertEquals(67, Main.parseSentence("i love computer science"));
    }
    @Test public void but_not_apple() {
        assertEquals(20, Main.parseSentence("but not apple"));
    }
    @Test public void help() {
        assertEquals(6, Main.parseSentence("help"));
    }
}