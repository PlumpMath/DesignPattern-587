package com.et.decorator.condiment.impl;

import com.et.decorator.beverage.Beverage;
import com.et.decorator.condiment.CondimentDecoretor;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2015年7月25日 下午8:41:51      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *摩卡调料
 */
public class Macha extends CondimentDecoretor {
   private Beverage beverage;

   public Macha(Beverage beverage) {
      this.beverage = beverage;
   }

   @Override
   public String getDescription() {
      return beverage.getDescription() + ", Macha(摩卡)";
   }

   /**
    * 调料的钱+饮料的钱
    */
   @Override
   public Double cost() {
      return 0.22 + beverage.cost();
   }

}
