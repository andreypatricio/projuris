package test;

import br.com.projuris.MyFindArray;
import org.junit.Assert;
import org.junit.Test;

public class FindArrayTest {

    @Test
    public void testingFirstDemonstration() {

        MyFindArray find = new MyFindArray();

        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {3, 7};

        int result = find.findArray(array, subArray);

        Assert.assertEquals(2, result);

    }

    @Test
    public void testingSecondDemonstration() {

        MyFindArray find = new MyFindArray();

        int[] array = {1, 3, 5};
        int[] subArray = {1};

        int result = find.findArray(array, subArray);

        Assert.assertEquals(0, result);

    }

    @Test
    public void testingThirdDemonstration() {

        MyFindArray find = new MyFindArray();

        int[] array = {7, 8, 9};
        int[] subArray = {8, 9, 10};

        int result = find.findArray(array, subArray);

        //Assert.assertEquals(-1, result);

        Assert.assertEquals(1, result);

    }

    @Test
    public void testingFourthDemonstration() {

        MyFindArray find = new MyFindArray();

        int[] array = {4, 9, 3, 7, 8, 3, 7, 1};
        int[] subArray = {3, 7};

        int result = find.findArray(array, subArray);

        Assert.assertEquals(5, result);

    }


}
