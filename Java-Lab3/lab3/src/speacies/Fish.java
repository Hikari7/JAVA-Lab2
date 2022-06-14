package speacies;

import animals.Animal;

//inheritate
public class Fish extends Animal
 {
  private boolean liveInWater;
  private boolean gills;


  public Fish() {
    super();   //animalからの要素
    this.liveInWater = true;
    this.gills = true;
  }


  public boolean isLiveInWater() {
    return liveInWater;
  }


  public boolean isGills() {
    return gills;
  }

  @Override 
  public String showInfo() {
    return "🐠Fishes[liveInWater= " + liveInWater + "gills= " + gills + "]";
  }


}
