/**
 * Created by butter on 16-9-29.
 */
public class Example {
    public static void main(String args[])
    {
        A.b = 100;//通过类名操作类变量b,并赋值100
        A.inputB();            //通过类名调用方法inputB()
        A cat=new A();
        A dog=new A();
        cat.setA(200);    //cat调用方法setA(int a)将cat的成员a的值设置为200
        cat.setB(400);    //cat调用方法setB(int b)将cat的成员b的值设置为400
        dog.setA(150);   //dog调用方法setA(int a)将dog的成员a的值设置为150
        dog.setB(300);  //dog调用方法setB(int b)将dog的成员b的值设置为300
        cat.inputA();   //cat调用inputA()。
        cat.inputB();//cat调用inputB()。
        dog.inputA();//dog调用inputA()。
        dog.inputB();   //dog调用inputB()。
    }
}
