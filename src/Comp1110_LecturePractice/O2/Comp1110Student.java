package Comp1110_LecturePractice.O2;

/**
 * @author XIN
 * @create 2022-08-29 12:39
 */
public class Comp1110Student extends Student {
    private int ass1;
    private int ass2;
    private int labtest;
    private int ce;
    private int mse;
    private int exam;

    public Comp1110Student(String name, int age, String uid, int ass1, int ass2, int labtest, int ce, int mse, int exam) {
        super(name, age, uid);
        this.ass1 = ass1;
        this.ass2 = ass2;
        this.labtest = labtest;
        this.ce = ce;
        this.mse = mse;
        this.exam = exam;
    }

    public int mark() {
        return ass1 + ass2 + labtest + ce + mse + exam;
    }

    public Grade grade() {
        return Grade.fromMark(mark());
    }
}

