/**
 * Created by butter on 16-9-29.
 */
public class A {
    float a;
    static float b;

    void setA(float a)
    {
        this.a = a;
    }
    void setB(float b)
    {
        this.b = b;//将参数b的值赋值给成员变量b
    }
    float getA()
    {
        return a;
    }
    float getB()
    {
        return b;
    }
    void inputA()
    {
        System.out.println(a);
    }
    static void inputB()
    {
        System.out.println(b);
    }
}
