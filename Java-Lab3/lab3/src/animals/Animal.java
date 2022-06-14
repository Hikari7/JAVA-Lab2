package animals;

//fefault counstructor -> MainでNEWにしたらこれがデフォルトになる
public class Animal {
  private int height;
  private int weight;
  private String animalType;
  private String bloodType;

  public Animal() {
    this.height = 160;
    this.weight = 50;
    this.animalType = "mammals";
    this.bloodType = "O";
  }
  
  //parametaored constrctor(引数つき)
  public Animal(int height, int weight, String animalType, String bloodType) {
    this.height = height;//key()
    this.weight = weight;
    this.animalType = animalType;
    this.bloodType = bloodType;
  }


  //getter、setterを作る（JSのオブジェクトの.みたいな役割）

public int getheight() {
 return height;
}
public int getwight() {
 return weight;
}
public String animalType() {
 return animalType;
}
public String bloodType() {
 return bloodType;
}
 

public String showInfo() {
  return "高さ =" + height;
}

  
}

