package 练习;

/**
 * @author XIN
 * @create 2022-08-10 0:14
 */
public class array_text {
    //方法一
    static  void ysxb(){
        System.out.println("压力马斯内");
    }
    //方法二 喜加一
    static int addOne(int i) {
        i = i + 1;
        return i;
    }
    //
    public static void main(String[] args) {
        int[] a = new int[]{1,1,4,5,1,4};
        for (int ysxb : a) {
            System.out.println("array value this time is " + ysxb);
        }
        ysxb();
    }
}
