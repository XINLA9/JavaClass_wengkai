package Java程序设计_翁恺.Class5;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-07-23 16:55
 */
public class twoDimensionalArray
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
