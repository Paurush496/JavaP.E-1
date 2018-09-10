import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringreverseTest {

    Stringreverse word;

    @Before
    public void setUp() {
        word = new Stringreverse();
    }

    @Test
    public void testNonString() {
        String testcase = word.Stringreverse("paurush496");
        String output = "6 9 4 h s u r u a p";
        Assert.assertEquals(testcase, output);
    }

    @Test
    public void testSpecialCharacter() {

        String testcase = word.Stringreverse("p@urush");
        String output = "h s u r u @ p";
        Assert.assertEquals(testcase, output);
    }

    @Test
    public void testUppercase() {

        String testcase = word.Stringreverse("India");
        String output = "a i d n I";
        Assert.assertEquals(testcase, output);
    }

    @Test
    public void testVeryLongString() {

        String testcase = word.Stringreverse("qwertyuiopasdfghjklzxcvbnm");
        String output = "m n b v c x z l k j h g f d s a p o i u y t r e w q";
        Assert.assertEquals(testcase, output);
    }

    @After
    public void tearDown() throws Exception {
        word = null;
    };
}