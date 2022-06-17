import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //計算結果を表示させるためのコード

        Scanner scanner = new Scanner(System.in);
        Calculator c1 = new Calculator();
        //caluculator c1 an instance of the class calculator set equal to a bew calculator class = クラスで作ったものをインスタンス化して、再利用する
        //これ使ったら計算ができる
        // Calculator c2 = new Calculator();

        //test-------------------------------------
        // c1.name = "BTS";
        // c2.name = "Jongkook";
        // System.out.println(c1.name + "💖" +  c1.add(3, 4));
        // System.out.println(c2.name + "💖" +  c2.multiplication(3, 4));
       
        //test-------------------------------------      
 
        //answerの空箱!!!!!!
        String answer;
        String repeat = "continue";
        
        while(repeat.equals("continue")) {

        //1.choose the first num
        // prepare the first variable (store the double x and save the value  of double, ここで１つ目の数字をとりあえず取得
        System.out.print("Please type the first number: ");
        double x = scanner.nextDouble();  

        //2. choose the operation
        System.out.println("Choose an operation: ");
        System.out.println(" > Type + for addition");
        System.out.println(" > Type - for subtraction");
        System.out.println(" > Type * for multiplication");
        System.out.println(" > Type + for division");

        //変数2つ目 answerをとりあえず取得(+, -, *, /)
        answer = scanner.next();
        

        // 3. choose the second number
        System.out.print("Please type the second number! ");
        double y = scanner.nextDouble(); 


 //4. Calculate and use if 

        if(answer.equals("+")){  //equals means === in JavaScript
            System.out.println( c1.add(x,y));
        } else if (answer.equals("-")) {
            System.out.println( c1.subtraction(x,y));
        } else if (answer.equals("*")) {
            System.out.println( c1.multiplication(x,y));
        } else if (answer.equals("/")) {
            System.out.println( c1.divide(x,y));
        } else {
            System.out.println("Unrecognized character was typed!");
        }
        
        System.out.println("Do you want to continue or quit?");
        repeat = scanner.next();
        
    }
    scanner.close();
    System.out.println("Bye!");
} 
}