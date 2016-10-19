/**
 * Created by butter on 16-9-29.
 */

public class Line {
    Point m_pA;
    Point m_pB;

    Line(Point a, Point b){
        m_pA = a;
        m_pB = b;
    }

    double GetLength(){
        return Math.sqrt(Math.pow(m_pA.m_dX - m_pB.m_dX, 2)
                + Math.pow(m_pA.m_dY - m_pB.m_dY, 2));
    }

    boolean IsStraight(){
        return m_pA.m_dY == m_pB.m_dY;
    }

    boolean IsVertical(){
        return m_pA.m_dX == m_pB.m_dX;
    }

    double GetSlope(){
        return (m_pA.m_dY - m_pB.m_dY) / (m_pA.m_dX - m_pB.m_dX);
    }

    Point GetMiddlePoint(){
        Point m = new Point((m_pA.m_dX + m_pB.m_dX) / 2 , (m_pA.m_dY + m_pB.m_dY) / 2);
        return m;
    }

    static boolean Equal(Line a, Line b){
        if(a.m_pB.m_dX == b.m_pB.m_dX && a.m_pA.m_dY == b.m_pA.m_dY ||
                a.m_pB.m_dX == b.m_pB.m_dY && a.m_pB.m_dY == b.m_pB.m_dX)
            return true;
        return false;

    }


}
