package com.et.runStrategy.duck.copy;

import com.et.runStrategy.duck.behavior.fly.FlyBehavior;
import com.et.runStrategy.duck.behavior.fly.impl.FlyNoWay;
import com.et.runStrategy.duck.behavior.fly.impl.FlyWithWings;
import com.et.runStrategy.duck.behavior.quack.QuackBehavior;
import com.et.runStrategy.duck.behavior.quack.impl.MuteQuack;
import com.et.runStrategy.duck.behavior.quack.impl.Quack;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2015年7月25日 下午9:13:43      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *策略模式：
 *       定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
 *设计原则：
 *       1.多用组合，少用继承
 *       2.封装变化
 *       3.针对接口编程，不针对实现编程
 */
public class Test {
   public static void main(String[] args) {
      // 1.
      FlyBehavior flyBehavior = new FlyNoWay();
      QuackBehavior quackBehavior = new Quack();
      DuckModel duck = new GreedMiniDuckSimulator();
      // 动态的设定行为，加入会飞翔的行为
      duck.setFlyBehavior(flyBehavior);
      // 动态的设定行为，加入沉默的行为
      duck.setQuackBehavior(quackBehavior);
      duck.display();
      duck.performFly();
      duck.performQuack();

      System.out.println("--------------------------");
      // 2.
      flyBehavior = new FlyWithWings();
      quackBehavior = new MuteQuack();
      duck = new RedDuckSimulator();
      // 动态的设定行为，加入会飞翔的行为
      duck.setFlyBehavior(flyBehavior);
      // 动态的设定行为，加入沉默的行为
      duck.setQuackBehavior(quackBehavior);
      duck.display();
      duck.performFly();
      duck.performQuack();

   }

}
