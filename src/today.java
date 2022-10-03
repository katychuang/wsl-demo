/* Display Today's Date */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class today {
  public static void main(String[] args){
    LocalDate date = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    System.out.println("Today is " + date.format(formatter));
  }
}
