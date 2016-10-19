/**
 * Created by butter on 16-9-29.
 */
public class Fraction {
    int up;
    int down;

    Fraction(int a, int b){
        up = a;
        down = b;
    }

    void Print()
    {
        System.out.println(up + " / " + down);
    }

    static Fraction Mult(Fraction f1, Fraction f2){
        Fraction t = new Fraction(f1.up * f2.up, f1.down * f2.down);
        return t;
    }
}
