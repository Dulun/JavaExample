/**
 * Created by butter on 16-10-13.
 */

class User{
    private String userName, password;
//定义一个无参构造方法的头部

    User(){
        System.out.println("全部为空!");
    }
 //定义一个构造方法，参数为name，用name初始化成员变量userName

    User(String name){
        this.userName = name;
    }
//定义一个构造方法的头部，参数为name和pwd
    User(String name, String pwd){
        this(name);
        password = pwd;
// 调用上个构造方法初始化userName
//初始化成员变量password
        check();
    }

    void check() {
        String s=null;
        if (userName!=null)
            s="用户名："+userName;
        else
            s="用户名不能为空！";
        if (password!="12345678")
            s=s+" 口令无效！";
        else
            s=s+" 口令：********";
        System.out.println(s);
    }
}
public class RunDemo {
    public static void main(String[] args) {
        new User();
        new User("刘新宇");
        new User(null,"邵丽萍");
        new User("张驰","12345678");
    }
}