package CuiKai_Lecture_Practice.Class4;

import java.util.Scanner;

/**
 * @author XIN
 * @create 2022-07-23 15:00
 */
public class primeJudge
{

    public static void main(String[]args)
    {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int isPrime =1;
            for (int i =2; i< n; i++)
            {
                if (n%i==0)
                {
                    isPrime = 0;
                    System.out.println(n+"不是素数，i="+i);
                    break;
                }
            }
        if (isPrime == 1){
            System.out.println(n+"是素数");
        }
    }
}
