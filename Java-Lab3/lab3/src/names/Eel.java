package names;

import speacies.Fish;

public class Eel extends Fish {//extendsを使うと親クラスを使うことができる(inheritate)
  private boolean elecrticCharge;
  private boolean showinfo;

  public Eel() {
    super();
    this.elecrticCharge = true;
  }

  public boolean isElecrticCharge() {
    return elecrticCharge;
  }

  public boolean isShowinfo() {
    return showinfo;
  }

  @Override
  public String showInfo() {
    // return "ここにgetterのretunした値が返ってくる。こんな感じで" + getwight();
    return "🍚Eel[ [Height:" + getheight() + ", Weight:" + getwight() +", animalType:" + animalType() + ", bloodType: " + bloodType() + ", liveInWater: " + isLiveInWater()+  ", gills: " + isGills()+  ", elecrticCharge: " + elecrticCharge + "]";
  }

  

  
}
