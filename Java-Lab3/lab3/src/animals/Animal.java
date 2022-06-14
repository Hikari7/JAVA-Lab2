package animals;

//fefault counstructor -> MainでNEWにしたらこれがデフォルトになる
public class Animal {
  private int height;
  private int weight;
  private String animalType;
  private String bloodType;

  public Animal() {//メソッド
    this.height = 160;
    this.weight = 50;
    this.animalType = "lovely";
    this.bloodType = "smelly";
  
    //メソッド内からクラスのフィールドにアクセスするには「this」という特殊なキーワードを使う
  }
  
  //parametaored constrctor(引数つき)
  // public Animal(int height, int weight, String animalType, String bloodType) {
  //   this.height = height;//key()
  //   this.weight = weight;
  //   this.animalType = animalType;
  //   this.bloodType = bloodType;
  // }


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
 
public void setHeight(int height) {
  this.height = height;
}

public void setWeight(int weight) {
  this.weight = weight;
}

public void setAnimalType(String animalType) {
  this.animalType = animalType;
}

public void setBloodType(String bloodType) {
  this.bloodType = bloodType;
}

public String showInfo() {
  return "💖Here is the all animal's info💖 " + "Height: " + height + " ,Weight: " + weight + " ,animalType: " + animalType + " ,bloodType: " + bloodType;
}


}

