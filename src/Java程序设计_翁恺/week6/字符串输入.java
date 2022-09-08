package Java程序设计_翁恺.week6;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-08-05 15:34
 */
public class 字符串输入 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        s = scan.nextLine();
        System.out.println(s);
        s = scan.next();
        System.out.println(s);
//        ==是在比较两个量是否管理同一个对象
        System.out.println(s=="bye");
//        equals则是在比较两者的内容是否相同
        System.out.println(s.equals("bye"));

    }
}
