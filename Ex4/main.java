package Ex4;

public class main {
    public static void main(String[] args) {
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current time: " + time);
        time.nextSecond();
        System.out.println("After next second: " + time);
    }
}
