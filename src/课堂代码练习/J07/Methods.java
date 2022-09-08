package 课堂代码练习.J07;

/**
 * @author XIN
 * @create 2022-08-01 13:41
 */
public class Methods {
    static  void hello()
    {
        System.out.println("Hello");
    }
    static int addone(int i)
    {
        i = i++;
        return i;
    }

    public static void main(String[] args) {
        hello();
        Methods.hello();
        int k = 5;
        System.out.println("k = " + k);
        Methods.addone(k);
        System.out.println("k = " + k);
    }
}
