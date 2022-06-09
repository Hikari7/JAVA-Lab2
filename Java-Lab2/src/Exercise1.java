import java.util.Scanner;

public class Exercise1 {
      public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter start number! ");
        int start = scanner.nextInt();
        System.out.println("Please enter end number! ");
        int end = scanner.nextInt();

        for(int i = start; i <=  end; i++) {
          System.out.println(start++);
        }
    }
}
