
/**
 * Created by butter on 16-9-29.
 */
public class AreaAndLength {
    public static void main(String args[]) {

        double length,area;
        Circle circle    = new Circle(5);
        Trangle trangle  = new Trangle(4, 5, 6);
        Lader lader      = new Lader(3, 5, 4);

        length = circle.getLength();
        System.out.println("圆的周长:"+length);


        area = circle.getArea();
        System.out.println("圆的面积:"+area);


        length = trangle.getLength();
        System.out.println("三角形的周长:"+length);

        area = trangle.getArea();
        System.out.println("三角形的面积:"+area);


        area = lader.getArea();
        System.out.println("梯形的面积:"+area);

        trangle.setABC(12, 34, 1);
        area = trangle.getArea();
        if(area != -1)
            System.out.println("三角形的面积:"+area);

        length = trangle.getLength();
        System.out.println("三角形的周长:"+length);


        circle.setRadius(2);
        System.out.println("area: " + circle.getArea());
        System.out.println("length: " + circle.getLength());
    }

}

