package 课堂代码练习.O05;

import 课堂代码练习.O05.Greeter;

public class Human extends Mammal implements Greeter {
    enum Language {
        ENGLISH,
        MANDARIN;
    }

    private Language lang = Language.ENGLISH;

    public Human(String name) {
        super(name);

    }

    public Human(String name, Language lang) {
        super(name);
        this.lang = lang;
    }

    @Override
    public String toString() {
        return super.toString() + " walks on two legs";
    }

    public void greet() {
        switch (lang) {
            case ENGLISH -> System.out.println("Hello");
            case MANDARIN -> System.out.println("Nihao");
        }
    }
}
