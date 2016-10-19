/**
 * Created by butter on 16-9-29.
 */
public class Trangle {
    double m_dA;
    double m_dB;
    double m_dC;

    double m_dArea;
    double m_dPreme;
    boolean legal = false;

    void checkLegal(){
        legal = false;
        if(m_dA + m_dB > m_dC){
            if(Math.abs(m_dA - m_dB ) < m_dC) {
                legal = true;
            }
        }
    }

    Trangle(double a, double b, double c){
        m_dA = a;
        m_dB = b;
        m_dC = c;
        checkLegal();
    }

    double getArea(){
        if(legal){
            double t = (m_dA + m_dB + m_dC) / 2;
            m_dArea = Math.sqrt(t * (t-m_dA)* (t-m_dB)* (t-m_dC));
            return m_dArea;
        }
        else{
            System.out.println("不是一个三角形,不能计算面积");
            return -1;
        }

    }

    double getLength(){
        return m_dA + m_dB + m_dC;
    }

    void setABC(double a, double b, double c){
        m_dA = a;
        m_dB = b;
        m_dC = c;
        checkLegal();
    }

    double getSideA(){
        return m_dA;
    }

    double getSideB(){
        return m_dA;
    }

    double getSideC(){
        return m_dA;
    }



}
