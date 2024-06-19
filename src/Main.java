import java.sql.Time;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
    }
    private static void task1(){
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
    }
}