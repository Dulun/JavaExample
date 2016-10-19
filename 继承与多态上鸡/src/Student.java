/**
 * Created by butter on 16-10-13.
 */
public class Student {

    protected String name; //具有保护修饰符的成员变量
    protected int number;
    void setData(String m,int h) {//设置数据的方法

        name   = m;
        number = h;
    }

    public void print() {//输出数据的方法

        System.out.println(name+", "+number);
    }

}
