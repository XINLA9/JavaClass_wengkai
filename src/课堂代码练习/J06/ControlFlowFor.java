package 课堂代码练习.J06;

import java.util.Arrays;

/**
 * @author XIN
 * @create 2022-08-01 13:03
 */
public class ControlFlowFor {
//    方法一：遍历数组
    static void arrays(int[]a){
        for (var v :a){
            System.out.print("" + v);
        }
    }
//    方法二：对比数组
    private static void ylmsn(int[]a){
        int []b = {1,1,4,5,1,4};
        if (Arrays.equals(b, a)){
            System.out.println("压力马斯内！");
        }else {
            System.out.println("嗯哼哼！");
        }
    }


    //    主方法
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("i = " + i);
        }
//      break语句和终止符
        outer:for(int i = 0; i < 9; i++)
        {
            break outer;
        }
//        数组
        int []a = {1,1,4,5,1,4};
        int []b = {1,9,1,9,8,1,0};
        arrays(a);
        System.out.println();
        ylmsn(a);
        ylmsn(b);
    }

}
