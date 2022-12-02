package ExamTest;

/**
 * @author XIN
 * @create 2022-11-08 10:04
 */
public class bytes {
    public static void main(String[] args) {
        String s = "00303";
        while(s.charAt(0) == '0')
        {
            s = s.substring(1);
        }
        System.out.println(Integer.valueOf(s));



        /*s = s.substring(1);
        System.out.println(s);
        s = s.substring(0,s.length() - 1);
        System.out.println(s);*/
    }
}
