import java.util.Scanner;

//Write a program that asks the user to enter a word. The program will then repeat the word for as many times as its characters: Sample Output:
// Enter a word: Hello
// Expected Output :
// Hello Hello Hello Hello Hello

import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String word = scanner.nextLine(); //Hello

    int num = word.length();   //container for counting the char, 5
    int i;
    for(i = 1; i <= num; i++ ) { //1, 2, 3, 4, 5
     System.out.printf("%s ",word );
    }

    
  scanner.close();


  }
}
