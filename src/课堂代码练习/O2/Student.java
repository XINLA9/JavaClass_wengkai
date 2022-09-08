package 课堂代码练习.O2;

import 课堂代码练习.O1.Person;

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
