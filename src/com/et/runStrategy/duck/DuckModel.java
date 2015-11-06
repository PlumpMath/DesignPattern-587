package com.et.runStrategy.duck;

import com.et.runStrategy.duck.behavior.fly.FlyBehavior;
import com.et.runStrategy.duck.behavior.quack.QuackBehavior;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2015年7月24日 下午9:54:24      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *鸭子模型，把变化的单独抽取出来，不变的放这里
 */
public abstract class DuckModel {
   // 把变化的行为抽取到接口，并通过子类实现，利用组合模式实现代码福永
   protected FlyBehavior flyBehavior;
   // 把变化的行为抽取到接口，并通过子类实现，利用组合模式实现代码福永
   protected QuackBehavior quackBehavior;

   /**
    * 动态设定行为，传入不同子类，实现不一样的行为
    * @param flyBehavior
    */
   public void setFlyBehavior(FlyBehavior flyBehavior) {
      this.flyBehavior = flyBehavior;
   }

   /**
    * 动态设定行为，传入不同子类，实现不一样的行为
    * @param flyBehavior
    */
   public void setQuackBehavior(QuackBehavior quackBehavior) {
      this.quackBehavior = quackBehavior;
   }

   public abstract void display();

   /**
    * 调用抽取出来的行为
    */
   public void performQuack() {
      quackBehavior.quack();
   }

   public void performFly() {
      flyBehavior.fly();
   }
}
