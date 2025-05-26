import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    
    //2025 4 28 
    int year = 2025;
    int month = 4;
    int date = 28;

    LocalDate ld1 = LocalDate.of(2025, 4, 28);
    LocalDate ld2 = LocalDate.of(2025, 3, 30);
    System.out.println(ld1.isAfter(ld2));
    System.out.println(ld2.isBefore(ld1));
    System.out.println(ld2.isEqual(ld1));

    LocalDate newDate = ld1.plusDays(7);
    System.out.println(newDate);

    //改變 
  System.out.println(LocalDate.of(2024,12,20).plusMonths(2));
    // plus week 

    //LocalDate.of(2025,1,32) 

    System.out.println(LocalDate.of(2025,1,31).minusDays(60));

    // 提取
    Month m1 = LocalDate.of(2025,1,2).getMonth();
    System.out.println(m1.getValue());
    System.out.println(m1.toString());//January

 




  }
}