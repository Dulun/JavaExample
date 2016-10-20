/**
 * Created by butter on 16-10-13.
 */
public class Undergraduate extends Student {

    String academy;     //定义成员变量academy
    String department;  //定义成员变量department

    public static void main(String args[]) {

        Student s = new Student();                  //创建一个学生对象s
        s.setData("Lola", 1);                       //用父类的setData方法初始化对象s
        s.print();                                  //对象s调用print方法
        Undergraduate u = new Undergraduate();      //创建一个大学生对象u
        u.setData("Atom", 2);                       //调用父类的成员方法setData初始化对象u
        u.academy    = "CS";                        //设置对象u的成员变量academy
        u.department = "CS";                        //设置对象u的成员变量department

        System.out.print(u.name+", "+u.number+", "+u.academy+", "+u.department);
    }
}
