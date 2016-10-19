/**
 * Created by butter on 16-9-29.
 */
public class Circle {

    double radius,area;
    Circle(double r){
        radius = r;
    }

    double getArea(){
        return area = Math.PI * radius * radius;
    }

    double getLength(){
        return 2 * Math.PI * radius;
    }

    void setRadius(double newRadius) {
        radius=newRadius;
    }

    double getRadius() {
        return radius;
    }

}
