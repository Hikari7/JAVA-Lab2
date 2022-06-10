import java.util.Scanner;

//Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.
// Input the N: 10
// Expected Output :
// The sum of 1 to 10 is 55

public class Exercise2 {

public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);
  System.out.print("Please enter yout favorite number! ");
  int num = scanner.nextInt();
  int sum;
  sum = 0;

  for(int i = 1; i <= num ; i++) {
    sum = sum + i;
  }
  System.out.println(sum);
scanner.close();  
}



}