package 练习;

/**
 * @author XIN
 * @create 2022-08-09 23:59
 */
public class instance_variables {
    private int a=1; //实例变量
    public void b()
    {
        int a=2; //局部变量
        System.out.println("局部变量:a="+a);
        System.out.println("实例变量:a="+this.a);//局部变量的作用域内引用实例变量:this.变量名
        this.a = a;
        System.out.println("现在实例变量:a="+this.a);
    }
    public static void main(String[] args)
    {
        new instance_variables().b();
    }
}
