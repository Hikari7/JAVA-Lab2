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


class Car implements Comparable<Car> {
    private String make;
    private String model;
    private Integer year;
    public Car(String make, String model, Integer year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
    }
    @Override
    public int compareTo(Car o) {
       if(year == o.year) {
        return 0;
       } else if (year > o.year) {
        return 1;
       } else {
        return -1;
       }
    }

    

    
}

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

    public static void question2() {
        ArrayList<Integer> randomNumList = new ArrayList<>();
        for(int i = 0; i<10; i++) 
        randomNumList.add(getRandomNumber(50,1));

        ArrayList<Integer> randomCopyList = new ArrayList<>();
        randomCopyList.addAll(randomNumList);

        System.out.println("----Before setting----");
        System.out.println("Original" + randomNumList);
        System.out.println("Copy: " + randomCopyList);

        randomNumList.set(randomNumList.size() - 1, -5);

        System.out.println("----After setting----");
        System.out.println("Original" + randomNumList);
        System.out.println("Copy: " + randomCopyList);

    }

    public static void question3() {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Jeep", "Wrangler", 1986));
        cars.add(new Car("Honda", "Civic", 1975));
        cars.add(new Car("Toyota", "Camry", 1982));

        for(Car car: cars) {
            System.out.println("Element: " +car);
        }

        System.out.println("---------");

        // cars.sort(null);
        cars.sort(null);

        for(Car car: cars) {
            System.out.println("Element: " +car);
        }

        
    }
    // public static void question3() {}
    public static void main(String[] args) throws Exception {
        // question1();
        // question2();
        question3();
    }

    
}
