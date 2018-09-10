import org.junit.Assert;
import org.junit.Test;

public class NumIteratorTest {

    @Test
    public void testcaseone() {

        NumberIteratore numberone = new NumberIterator();
        String case1 = numberone.numIterator(5);
        String answer1 = "1 2 2 3 3 3 4 4 4 4 5 5 5 5 5";
        Assert.assertEquals(case1, answer1);
    }
}