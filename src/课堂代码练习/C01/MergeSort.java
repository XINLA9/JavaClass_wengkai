package 课堂代码练习.C01;

/**
 * @author XIN
 * @create 2022-08-26 12:42
 */
public class MergeSort {
    private String name;
    private int age;
    public static int[] mergeSort(int[] unsorted)
    {
        if (unsorted.length <=1)
        {
            return unsorted;
        }
        int lSize = unsorted.length;
        int rSize = unsorted.length - lSize;
        var left = new int[lSize];
        var right = new  int[rSize];
        System.arraycopy(unsorted,0,left,0,lSize);
        System.arraycopy(unsorted,0,left,0,rSize);
        var l = 0;
        var r = 0;
        var sorted = new int[unsorted.length];

        return unsorted;
    }

  public void mergeSortTest()
  {
      var unsorted = new  int[]{5,6,20,3,2,16,43};
      var sorted = new int[]{};
  }

  //merge

}
