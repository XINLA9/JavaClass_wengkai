package ExamTest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XIN
 * @create 2022-11-07 22:32
 */
public class ComplexityTest {
    private static int timesComplexity = 0;
    private static int dataSize = 0;
    static <T extends Comparable<T>> void f(List<T> in) {
        boolean s;
        do {
            s = false;
            for (var i = 1; i < in.size() - 1; i += 2) {
                if (in.get(i).compareTo(in.get(i + 1)) > 0) {
                    var temp = in.get(i);
                    in.set(i, in.get(i + 1));
                    in.set(i + 1, temp);
                    s = true;
                }
                timesComplexity++;
            }
            for (var i = 0; i < in.size() - 1; i += 2) {
                if (in.get(i).compareTo(in.get(i + 1)) > 0) {
                    var temp = in.get(i);
                    in.set(i, in.get(i + 1));
                    in.set(i + 1, temp);
                    s = true;
                }
                timesComplexity++;
            }
        } while (s);
    }
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(6);
        testList.add(0);
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);
        testList.add(5);
        dataSize = testList.size();
        f(testList);
        System.out.println("The data size is " + dataSize +
                " and the time complexity is " + timesComplexity);
    }
}
