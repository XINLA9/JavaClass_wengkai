package Java程序设计_翁恺.week6;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-07-25 18:34
 */
public class char1 {
    public  static  void main(String[]args)
    {
        Scanner scan= new Scanner((System.in));
        char a = '汉';
//        char一次只能放一个，不能放多个字符
        char c = 'A';
        char d = (char) (c+'a'-'A');
        System.out.println("d = " + d);
    }
}
