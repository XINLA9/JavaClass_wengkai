package ExamTest;

/**
 * @author XIN
 * @create 2022-11-07 21:32
 */
public class ThreadTest implements Runnable {
    private int x=0;
    private int y=0;

    public static void main(String [] args) {
        ThreadTest obj = new ThreadTest();
        (new Thread(obj)).start();
        (new Thread(obj)).start();
    }

    public void run() {
        for (int i=0; i<10; i++) {
            x++;
            y++;
            System.out.println("x = " +x+"; y = "+y);
        }
    }
}
