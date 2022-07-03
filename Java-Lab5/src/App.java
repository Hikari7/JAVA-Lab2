import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSplitPaneUI;

//Q1:
// Create an ArrayList of Integers
// Fill each of the 10 slots with a random value from 1-50.
// Display those values on the screen, and then prompt the user for an integer.
// Search through the ArrayList, and if the item is present, print a message that the number is in the list.
// If the value is not in the ArrayList, print a message that the number is not in the list




public class App {

    public static int getRandomNumber(int max, int min) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min; //ランダムな数を作る
    }

    public static void question1() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> randomNumList = new ArrayList<>();

        for(int i = 0; i<10; i++) 
        randomNumList.add(getRandomNumber(50,1));

        System.out.println("Generated random numbers are:" + randomNumList);
        System.out.println("Please enter an integer: ");
        Integer x = input.nextInt();

        if(randomNumList.contains(x))
        System.out.println(x + " is in the list");
        else
        System.out.println(x+ " is not in the list");

        input.close();
    }

    // public static void question2() {}
    // public static void question3() {}
    public static void main(String[] args) throws Exception {
        question1();
        // question2();
        // question3();
    }
}
