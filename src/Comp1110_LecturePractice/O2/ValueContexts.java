package Comp1110_LecturePractice.O2;

/**
 * @author XIN
 * @create 2022-08-05 12:33
 */
public class ValueContexts {
    static int classField = 42;

    int membersField;

    ValueContexts(int membersField) {
        this.membersField = membersField;
    }
    static void foo(){
        ValueContexts v = new ValueContexts(11);
        System.out.println("v = " + v.membersField);
    }

    public static void main(String[] args) {
        foo();
    }


}
