/**
 * Created by butter on 16-9-29.
 */

public class Point {
    double m_dX;
    double m_dY;
    Point(double x, double y){
        m_dX = x;
        m_dY = y;
    }
    void ShowPoint(){
        System.out.println(m_dX + " " + m_dY);
    }
}
