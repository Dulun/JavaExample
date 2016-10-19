import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class XY{

    public static void main(String[] args){

        Scanner console = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        System.out.println("input");

        while (true) {

            try {
                int number = console.nextInt();
                if (number == 0) {
                    break;
                }

                sum += number;
                count++;
            }catch (java.util.InputMismatchException ex ){
                System.out.println("必须输入整数");
                System.out.println("input again ");
                console.next();

            }

        }
        System.out.printf("平均 %.2f\n", sum / count);

    }

    public static void doSwim(Swimmer swimmer){

        swimmer.swim();
    }

}