package Comp1110_LecturePractice.O2;

import Comp1110_LecturePractice.O1.Person;

/**
 * @author XIN
 * @create 2022-08-05 13:00
 */
public class Student extends Person {
    private String uid;

    Student(String name, int age, String uid) {
        super(name, age);
        this.uid = uid;
    }

    public String getUid() {
        return uid;
    }

    @Override
    public String toString() {
        return super.toString() + " is a student with UID " + uid;
    }
}
