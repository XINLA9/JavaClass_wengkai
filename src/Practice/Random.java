package Practice;

/**
 * @author XIN
 * @create 2022-08-13 23:37
 */
public class Random {
    public static void main(String[] args) {
        int number = 0;
        java.util.Random r = new java.util.Random();

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
