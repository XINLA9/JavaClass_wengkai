package Comp1110_LecturePractice.C01;

/**
 * @author XIN
 * @create 2022-08-26 12:28
 */
public class Maternalineage {

    public static String maternaAncestor(int n)
    {
        assert  n > 0;
        return  switch (n)
                {
                case 1 -> "mother";
                //base case n = 1
                case 2 -> "grandmother";
                default -> "great-" + maternaAncestor(n-1);
                };
    }

    public void naternalAncestorTest()
    {

    }
}
