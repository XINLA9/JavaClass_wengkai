package week5.class_5_3_1;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-07-23 16:55
 */
public class two_dimensional_array
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int [][] a = new int[3][5] ;
        a [0][0]= in.nextInt();
        int [][]b={
                {1,2,3,4,5},
                {1,3,4}
        };
        System.out.println(b);
    }
}
