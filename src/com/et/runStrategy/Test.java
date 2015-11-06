package com.et.runStrategy;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 上午11:39:01      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 */
public class Test {
   public static void main(String[] args) {
      // 接口声明,子类实现
      RunStrategy bike = new BikeStrategy();
      bike.run();

      // 如果我们要替换子类,那么只需要修改子类的生成,声明不需要改,调用者也不要改
      RunStrategy bus = new HorseStrategy();
      bus.run();
   }
}
