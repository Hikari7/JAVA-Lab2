// How many integers will be added?
// 5
// Enter an integer:
// 3
// Enter an integer:
// 4
// Enter an integer:
// -4
// Enter an integer:
// -3
// Enter an integer:
// 7

import java.io.Closeable;
import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    //times of calculate = times
    Scanner scanner = new Scanner(System.in);
    System.out.print("How many integers will be added?");
    int times = scanner.nextInt();
    System.out.println(times);

  
    int sum = 0;
    
    for(int i = 0; i < times; i++ ){
      System.out.print("Enter an integer: ");
      int num = scanner.nextInt();  //num = the number user input

      //sum = total number
      sum = sum + num;
      
    }
    System.out.println(sum);
    
    scanner.close();

  }
  
}
