package test;

import br.com.projuris.MyFindChar;
import org.junit.Assert;
import org.junit.Test;

public class FindCharachterTest {

    @Test
    public void testingFirstDemonstration() {

        MyFindChar myFindChar = new MyFindChar();
        char result = myFindChar.findChar("stress");

        Assert.assertEquals('t', result);

    }

    @Test
    public void testingSecondDemonstration() {

        MyFindChar myFindChar = new MyFindChar();
        char result = myFindChar.findChar("reembolsar");

        Assert.assertEquals('m', result);

    }


}
