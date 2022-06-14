package speacies;

import animals.Animal;

//inheritate
public class Reptile extends Animal {  
  private boolean drySkin;
  private boolean backbone;
  private boolean softEggs;


  public Reptile() {
    super();
    this.drySkin = true;
    this.backbone = true;
    this.softEggs = true;
  }


  public boolean isDrySkin() {
    return drySkin;
  }


  public boolean isBackbone() {
    return backbone;
  }


  public boolean isSoftEggs() {
    return softEggs;
  }

  @Override
public String showInfo() {
  // return "ここにgetterのretunした値が返ってくる。こんな感じで" + getwight();
  return "🦎Reptile [Height:" + getheight() + ", Weight:" + getwight() +", animalType:" + animalType() + ", bloodType: " + bloodType() + ", drySkin: " + drySkin + ", backbone: " + backbone + ", softEggs: " + softEggs + "]";
  
}
  
}
