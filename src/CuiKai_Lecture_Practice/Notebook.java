package CuiKai_Lecture_Practice;

import java.util.ArrayList;

/**
 * @author XIN
 * @create 2022-10-07 13:34
 */


public class Notebook{
        private final ArrayList<String> notes = new ArrayList<String>();

    /**
     * this method will input a string and add it to the arraylist
     * @param s 要添加到列表的string
     */
    public void add(String s)
        {
            notes.add(s);
        }

        public int getSize(){
            return notes.size();
        }

    /**
     * thie method will input an index and return the string in the
     * @param index an int input refers to the string we want
     * @return the string in the arrayList the index refers to
     */
    public String getNote(int index)
        {
            return notes.get(index);
        }

    /**
     *put in an int and remove the element int the arrayList it refers to.
     * @param index an int refer to the element position in the arrayList.
     * @return a boolean whether the element can be removed.
     */
        public  boolean removeNote(int index)
        {
            return true;
        }

        public  String[] list()
        {
            return  new String[10];
        }

    public static void main(String[] args) {
        String[] a = new String[2];
        a[0] = "first";
        a[1] = "second";
        Notebook nb = new Notebook();
        nb.add("first");
        nb.add("second");
        System.out.println(nb.getSize());
    }
}
