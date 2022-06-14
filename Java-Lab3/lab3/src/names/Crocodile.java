package names;

// import animals.Animal;
import speacies.Reptile;

public class Crocodile extends Reptile {
  private boolean hardSHell;
  private boolean showinfo;

  public Crocodile() {
    super();
    this.hardSHell = true;
    this.showinfo = true;
  }

  public boolean isHardSHell() {
    return hardSHell;
  }
  public boolean isShowinfo() {
    return showinfo;
  }

  @Override
  public String showInfo() {
    return "🐢Crocodile [Height:" + getheight() + ", Weight:" + getwight() +", animalType:" + animalType() + ", bloodType:" + bloodType() + ", drySkin: " + isDrySkin()+ ", backbone " + isBackbone() + ", hardSHell: " + hardSHell + "]";
  }
  
}
