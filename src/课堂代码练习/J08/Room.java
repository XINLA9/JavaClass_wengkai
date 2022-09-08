package 课堂代码练习.J08;

/**
 * @author XIN
 * @create 2022-08-05 13:35
 */
public class Room {
    private  String name;
    private  Flooring floor;

    public Room(String name, Flooring floor) {
        this.name = name;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }
}
