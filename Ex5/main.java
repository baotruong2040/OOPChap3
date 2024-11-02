package Ex5;

public class main {
    public static void main(String[] args) {
        MyDate date = new MyDate(2024, 2, 28);
        System.out.println("Current date: " + date);
        date.nextDay();
        System.out.println("After next day: " + date);
    }
}
