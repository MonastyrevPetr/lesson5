import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {
    @Test
    public void test1() {
        int[] in = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] out = new int[]{5, 6, 7};
        Assert.assertArrayEquals(out, Main.array4(in));
    }

    @Test(expected = RuntimeException.class)
    public void test2() {
        int[] in = new int[]{1, 2, 3, 5, 6, 7};
        Main.array4(in);
    }

    @Test
    public void test3() {
        int[] in = new int[]{1, 2, 3, 4};
        int[] out = new int[]{};
        Assert.assertArrayEquals(out, Main.array4(in));
    }

    @Test
    public void test4() {
        int[] in = new int[]{1, 2, 3, 4};
        Assert.assertFalse(Main.arrayOnly1and4(in));
    }

    @Test
    public void test5() {
        int[] in = new int[]{1, 1, 1, 1, 1, 1};
        Assert.assertFalse(Main.arrayOnly1and4(in));
    }

    @Test
    public void test6() {
        int[] in = new int[]{4, 4, 4, 4, 4, 4, 4};
        Assert.assertFalse(Main.arrayOnly1and4(in));
    }

    @Test
    public void test7() {
        int[] in = new int[]{4, 1, 1, 1, 1, 1, 4};
        Assert.assertTrue(Main.arrayOnly1and4(in));
    }
}
