package names;

// import animals.Animal;
import speacies.Reptile;

public class Crocodile extends Reptile {
  private boolean hardSHell;
  private boolean showinfo;

  public boolean isHardSHell() {
    return hardSHell;
  }
  public boolean isShowinfo() {
    return showinfo;
  }

  @Override
  public String showInfo() {
    return "🐢Crocodile [hardSHell =" + hardSHell + "]";
  }
  
}
