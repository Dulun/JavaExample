package one;

/**
 * Created by butter on 16-11-6.
 */
public class ChainTest {

    public static void main(String[] args) {

        ChainTest ct = new ChainTest();
        try {
            ct.test2();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }

    public void test1() throws DrunkException{
        throw new DrunkException("喝酒别开车");
    }

    public void test2() throws RuntimeException{
        try {
            test1();
        } catch (DrunkException e) {
            RuntimeException newExc = new RuntimeException(e);
            throw newExc;
        }
    }


}
