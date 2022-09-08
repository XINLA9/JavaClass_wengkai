package Java程序设计_翁恺.Class8;

/**
 * @author XIN
 * @create 2022-08-03 15:32
 */
public class Clock {
    private  int value = 0;
    private  int limit = 0;
//
    public Clock(int limit)
    {
        this.limit = limit;
    }
//
    public void increase(){
        value++;
        if (value==limit){
            value = 0;
        }
    }
//
    public int getValue(){
        return value;
    }

    public static void main(String[] args) {
        Clock d = new  Clock(24);
        for( ;; ){
            d.increase();;
            System.out.println(d.getValue());
        }
    }
}
