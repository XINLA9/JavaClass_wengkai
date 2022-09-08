package Java程序设计_翁恺.week6;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-08-05 15:53
 */
public class 字符串操作 {
    public static void main(String[] args) {
//        比长度
        Scanner in = new Scanner(System.in);
        String s1 = "abc";
        String s2 = "abcd";
        System.out.println(s1.compareTo(s2));
//        访问string里的字符
        for(int count = 0; count < s1.length(); count++)
        {
            System.out.println(s1.charAt(count));
        }
//        得到子串
        String s3 = "0123456789汉字";
        System.out.println(s3.substring(4));
        System.out.println(s3.substring(4,9));
//        寻找字符
        System.out.println(s3.indexOf('4'));
        System.out.println(s3.indexOf('A'));
        System.out.println(s3.indexOf("123"));
    }
}
