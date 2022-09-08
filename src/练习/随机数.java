package 练习;

import java.util.Random;

/**
 * @author XIN
 * @create 2022-08-13 23:37
 */
public class 随机数 {
    public static void main(String[] args) {
        int number = 0;
        Random r = new Random();

            number = (int)(r.nextInt(16)+1);
        System.out.println("number = " + number);
            number = (int)(r.nextInt(16)+17);
        System.out.println("number = " + number);
            number = (int)(r.nextInt(16)+33);
        System.out.println("number = " + number);
            number = (int)(r.nextInt(12)+49);
        System.out.println("number = " + number);
    }
}
