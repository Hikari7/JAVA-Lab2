import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //計算結果を表示させるためのコード
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type the first number! ");
        int first = scanner.nextInt();  
        //nextInt: 整数値を受け取る
        
        System.out.println("Choose an operation: ");
        System.out.println(" > Type + for addition");
        System.out.println(" > Type - for subtraction");
        System.out.println(" > Type * for multiplication");
        System.out.println(" > Type + for division");


        switch (scanner.next()) {
            case "+":
            System.out.println("> Type + for addition");
            break;
            case "-":
            System.out.println("> Type - for subtraction");
            break;
            case "*":
            System.out.println("> Type * for multiplication");
            break;
            case "/":
            System.out.println("> Type / for division");
            break;        
            default:
            System.out.println("Unrecognized option");
                break;
        }

public static void main(String[] args) {
    addition add = new addition();
    add.addition();
}

        System.out.print("Please type the second number! ");
        int second = scanner.nextInt();

        System.out.println("Do you want to continue or quit?");
        
        switch (scanner.next()) {
            case "continue":
            System.out.println("Ehhh");
                break;
            case "quit":
            System.out.println("Bye!");
                break;
            default:
            System.out.println("Unrecognized option");
                break;
        }

        scanner.close();
    }
}
