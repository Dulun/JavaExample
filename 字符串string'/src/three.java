import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Formatter;

/**
 * Created by butter on 16-11-7.
 */
public class three {

//    private String name;
//    private Formatter f;
//
//    public three(String name, Formatter f) {
//        this.name = name;
//        this.f = f;
//    }
//
//    public void move(int x, int y) {
//        f.format("%s the three is at (%d, %d)\n", name, x, y);
//    }
//
//    public static void main(String[] args) {
//        PrintStream outAlias = System.out;
//
//
//        three th = new three("tommy", new Formatter(System.out));
//
//        three th2 = new three("outAlias", new Formatter(outAlias));
//
//        th.move(0, 0);
//        th2.move(4, 8);
//        th.move(3, 4);
//        th2.move(2, 5);
//        th.move(3, 3);
//        th2.move(3, 3);
//
//        }
//    }


    public static void main(String[] args) {
        String a = "West World";
        Formatter f = new Formatter(System.err);
        f.format("this is the %s\n", a);
    }
}
