package animals.speacies;

import animals.Animal;



//defaultのオブジェクトを作成→　mainで使えるようになりました
public class Birds extends Animal {
  private boolean feathers;
  private boolean canFly;


  //public = function みたいな
  public Birds() {
    super();
    this.feathers = true;
    this.canFly = true;
  }


  //getterで値を取る（JSのオブジェクトの.みたいな役割）
  public boolean isFeathers() {
    return feathers;
  }


  public boolean isCanFly() {
    return canFly;
  }

@Override
public String showInfo() {
  return "ここにgetterのretunした値が返ってくる。こんな感じで" + getheight();
}

  
}
