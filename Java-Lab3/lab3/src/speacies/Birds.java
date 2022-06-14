package speacies;

import animals.Animal;



//defaultのオブジェクトを作成→　mainで使えるようになりました
public class Birds extends Animal {
  //extendsを使うと親クラスを使うことができる(inheritate)//今回の親はAnimal
  private boolean feathers;
  private boolean canFly;


  //public = function みたいな
  public Birds() {
    super();  //superをつけると親クラスを呼べる
    // super(height: 0.0d, weight: 0.0d, animalType:"Bird", bloodType: "Warm-blood"); 引数がある場合はここに  
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
  // return "ここにgetterのretunした値が返ってくる。こんな感じで" + getwight();
  return "🦢Birds[Height:" + getheight() + ", Weight:" + getwight() +", animalType:" + animalType() + ", bloodType:" + bloodType() + ", feathers: " + feathers + ", canFly:" + canFly + "]";
}
 
}
