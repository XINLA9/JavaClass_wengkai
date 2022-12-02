package CuiKai_Lecture_Practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author XIN
 * @create 2022-11-06 21:50
 */
public class File {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        String word = "apple";
        System.out.println(word.charAt(word.length()-1));
        word = word.toUpperCase();
        System.out.println(word);
        byte[] buf = new byte[10];
        for(int i = 0; i < buf.length; i++)
        {
            buf[i] = (byte)i;
        }
        try {
            FileOutputStream fos = new FileOutputStream("a.dat");
            fos.write(buf);
            fos.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
