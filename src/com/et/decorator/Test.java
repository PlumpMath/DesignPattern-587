package com.et.decorator;

import com.et.decorator.beverage.Beverage;
import com.et.decorator.beverage.impl.Espresso;
import com.et.decorator.beverage.impl.HouseBlend;
import com.et.decorator.condiment.impl.Macha;
import com.et.decorator.condiment.impl.Soy;
import com.et.decorator.condiment.impl.Whip;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2015年7月25日 下午8:47:23      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *装饰者模式：
 *       动态的将职责附加到对象上。想要扩展功能，装饰者提供有别于继承的另一种选择。
 *
 *一句话总结：动态的给一个对象增加额外的功能
 *解决问题： 1.额外增加的功能过多
 *        2.处理可撤销的职责
 *        3.不能产生子类方式来增加功能
 *模式结构： 先定义一个顶级可配置接口(Beverage 饮料超级基类)
 *        在定义一个装饰器类，里面包含了对被装饰对象的引用(CondimentDecoretor 调料装饰者)
 *        在构造里面传入被装饰对象，并且也要执行被装饰对象的方法
 *遵循设计原则：开放-封闭原则
 */
public class Test {
   public static void main(String[] args) {
      // 1.一杯不加调料的浓缩咖啡
      Beverage beverage = new Espresso();
      System.out.println(beverage.getDescription() + " $" + beverage.cost());

      // 2.一杯不加摩卡调料的浓缩咖啡
      Beverage beverage2 = new Espresso();
      beverage2 = new Macha(beverage2);
      System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

      // 3.一杯不加豆浆+奶泡+摩卡调料的综合咖啡
      Beverage beverage3 = new HouseBlend();
      beverage3 = new Soy(beverage3);
      beverage3 = new Whip(beverage3);
      beverage3 = new Macha(beverage3);
      System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

   }
}
