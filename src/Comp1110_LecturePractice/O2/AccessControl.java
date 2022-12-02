package Comp1110_LecturePractice.O2;

/**
 * @author XIN
 * @create 2022-08-05 12:50
 */
public class AccessControl {
    public static void main(String[] args) {
        FourOrderedints foi = new FourOrderedints();
        System.out.println(foi.data[0]);
        System.out.println(foi.data[1]);
        System.out.println(foi.data[2]);
        System.out.println(foi.data[3]);


        foi.replace(0,4);
        System.out.println("After replace");
        System.out.println(foi.data);
        foi.data[1] = 10;
        System.out.println(foi.data);
        foi.data = new int[3];
        System.out.println(foi.data);
    }
}
