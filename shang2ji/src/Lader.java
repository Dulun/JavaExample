/**
 * Created by butter on 16-9-29.
 */
public class Lader {


    double above,bottom,height,area;
    Lader(double a,double b,double h) {
        above = a;
        bottom = b;
        height = h;
    }

    double getArea(){
        return area = (above+bottom) * height / 2;
    }

}
