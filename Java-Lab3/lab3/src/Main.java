import animals.Animal;
import animals.speacies.Birds;

public class Main {
  

public static void main(String[] args) {
  //fefault counstructor 
  Animal  x = new Animal();  //Animalコンストラクターから実際にメソッドを作ったよ
 Birds Birds = new  Birds();

System.out.println(x.showInfo());
System.out.println(Birds.showInfo());


}



}

//parametaored constrctor(引数つき)
