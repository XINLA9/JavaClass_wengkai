package 课堂代码练习.J05;

/**
 * @author XIN
 * @create 2022-08-01 12:38
 */
public class ControlFlowSwitch {
    public static void main(String[] args) {
        int c = 0;
        switch (c){
            case 0 -> {

            }
            case 1 -> {

            }
            case 2 -> {

            }
        }
        String month = "Jan";
        switch (month){
            case "DEC","JAN","FEB" -> {
                System.out.println("Summer");
            }
            case "MAR","APR","MAY" -> {
                System.out.println("Fall");
            }
            case "JUN","JUL","AUG" -> {
                System.out.println("Winter");
            }
            case "SEP","OCT","NOV" -> {
                System.out.println("Spring");
            }
        }
    }
}
