package names;

import speacies.Birds;

public class Eagle extends Birds {
  private boolean showinfo;

  public Eagle() {
    super();
    
  }

  //birdsから取得していく
// @Override
// public boolean isFeathers() {
//   return feathers;
// }

  public boolean isShowinfo() {
    return showinfo;
  }



  @Override
  public String showInfo() {
    return "🦅Eagle =  [Height:" + getheight() + ", Weight:" + getwight() +", animalType:" + animalType() + ", bloodType:" +  " ,bloodType: " +  " ,bloodType: " + bloodType() + " ,feathers: " +  isFeathers() +", canFly:" + isCanFly() +"]";
  }
  
}

