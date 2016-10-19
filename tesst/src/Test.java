/**
 * Created by butter on 16-9-29.
 */
public class Test {
    public static void main(String[] a){

       /* Address a1 = new Address("A", "1", "aaa");
        Address a2 = new Address("B", "2", "bbb");
        Address a3 = new Address("C", "3", "ccc");

        a1.ShowInfo();
        a2.ShowInfo();
        a3.ShowInfo();*/
/*

        Point p0 = new Point(0, 0);

        Point p1 = new Point(3, 4);
        Point p2 = new Point(4, 3);



        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p0, p1);

        System.out.print("Length  " + l1.GetLength() + "\n");
        System.out.println("IsStraight ? " + l1.IsStraight());
        System.out.println("IsVertical()  " + l1.IsVertical());
        System.out.println("Slope:     " + l2.GetSlope());
        System.out.println("Equal? " + Line.Equal(l1, l2));

        Point m = l1.GetMiddlePoint();
        m.ShowPoint();
*/

        Fraction f1 = new Fraction(1, 2);

        Fraction f2 = Fraction.Mult(f1, f1);
        f2.Print();

        int k = 5;
        String s2 = "s"+k;
        System.out.print(s2);
    }
}
