package animals;

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
  
  public Animal(int height, int weight, String animalType, String bloodType) {
    this.height = height;
    this.weight = weight;
    this.animalType = animalType;
    this.bloodType = bloodType;
  }


  
  
}

