package Practice;

/**
 * @author XIN
 * @create 2022-11-07 21:29
 */
    public class Thready implements Runnable {
        int x = 1;
        int y = 1;

        public void run() {
            if (x == 2) x = 0;
            else incX();
            if (y == 2) y = 0;
            else y++;
        }

        public synchronized void incX() {
            x = x + 1;
        }

    public static void main(String[] args) {
    }
    }

