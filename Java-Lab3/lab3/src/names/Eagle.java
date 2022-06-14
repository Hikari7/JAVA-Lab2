package names;

import speacies.Birds;

public class Eagle extends Birds {
  private boolean showinfo;

  public boolean isShowinfo() {
    return showinfo;
  }

  @Override
  public String showInfo() {
    return "🦅Eagle = " + showinfo ;
  }
  
}

