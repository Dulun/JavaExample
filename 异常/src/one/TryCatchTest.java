package one;

/**
 * Created by butter on 16-11-6.
 */
public class TryCatchTest {

    public static void main(String[] args) {

        TryCatchTest tc = new TryCatchTest();
        int result;

        result = tc.test1();
        System.out.println(result);

        result = tc.test2();
        System.out.println(result);

        result = tc.test3();
        System.out.println(result);

    }



    /**
     * divider(除数):
     * result(结果):
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出”抛出异常了！！！“，返回-1
     * 否则：返回result
     */

    public int test1(){

        int divider = 10;
        int result = 100;

        try {
            while(divider > -1){
                divider--;
                result = result + 100 / divider;
            }

            return result;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("循环拋出异常了");

            return -1;
        }
    }

    /**
     * divider(除数):
     * result(结果):
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出”抛出异常了！！！“，返回 result=999；
     * 否则：返回result
     * finally：打印输出”这是finally！！！哈哈！！“，同时打印输出result的值
     */

    public int test2(){

        int divider = 10;
        int result = 100;

        try {
            while(divider > -1){
                divider--;
                result = result + 100 / divider;
            }

            return result;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("跑出异常");

            return 999;
        }finally {
            System.out.println("this is finally !!" + result);
        }
    }


    /**
     * divider(除数):
     * result(结果):
     * try-catch捕获while循环
     * 每次循环，divider减一，result=result+100/divider
     * 如果：捕获异常，打印输出”抛出异常了！！！“
     * finally：打印输出”这是finally！！！哈哈！！“，同时打印输出result的值
     * 最后，返回1111做为结果
     */


    public int test3(){

        int divider = 10;
        int result = 100;

        try {
            while(divider > -1){
                divider--;
                result = result + 100 / divider;
            }

//            return result;

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("跑出异常");

//            return 999;
        }finally {
            System.out.println("this is finally OVER!!" + result);
        }

        return 111;
    }


}
