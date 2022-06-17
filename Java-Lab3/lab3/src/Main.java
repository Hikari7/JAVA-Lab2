import animals.Animal;
import names.Crocodile;
import names.Eagle;
import names.Eel;
import speacies.Birds;
import speacies.Fish;
import speacies.Reptile;

public class Main {
  
public static void main(String[] args) {
  //default counstructor 
  //classの変数(フィールド)
  Animal  animal = new Animal();  //インスタンス
  //実際にメモリ領域にデータを置くには、配列と同じように「new」してあげる必要がある
  //Animalコンストラクターから実際にメソッドを作ったよ
 //newとしてあげると領域をメモリ上に確保してくれて、tom にはその領域の番地が格納される->インスタンス化
 Birds birds = new  Birds();
 Reptile reptile = new  Reptile();
 Fish fish = new  Fish();
 Crocodile crocodile = new Crocodile();
 Eel Eel = new Eel();
 Eagle eagle= new Eagle();

System.out.println(animal.showInfo());
System.out.println(birds.showInfo());
System.out.println(reptile.showInfo());
System.out.println(fish.showInfo());
System.out.println(crocodile.showInfo());
System.out.println(Eel.showInfo());
System.out.println(eagle.showInfo());


}



}

//parametaored constrctor(引数つき)
