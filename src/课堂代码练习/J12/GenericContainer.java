package 课堂代码练习.J12;

/**
 * @author XIN
 * @create 2022-08-22 12:26
 */
public class GenericContainer<T> {

    private  T value;

    public GenericContainer(T value)
    {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GenericContainer{" +
                "value=" + value +
                '}';
    }

   /* public <v> toint makestring(V value)
    {
        return this.value.toString();
    } */

    public static void main(String[] args) {
        var c = new GenericContainer(30);
        var c2 = new GenericContainer(2.3);
        var c3 = new GenericContainer(4.3f);

        System.out.println("c = " + c.toString());
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
    }
}
