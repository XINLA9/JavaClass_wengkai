package Comp1110_LecturePractice.O2;
import java.util.Arrays;


/**
 * @author XIN
 * @create 2022-08-05 12:43
 */
public class FourOrderedints {

    public  int[] data = new int[4];


//    public static void main(String[] args) {
//        FourOrderedints foi = new FourOrderedints();

//    }

    public void replace(int pos, int value){
        for(int i = 0; i < data.length; ++i)
        {
            if(i == pos){
                data[i]=value;
                break;
            }
        }
        Arrays.sort(data);
    }
}
