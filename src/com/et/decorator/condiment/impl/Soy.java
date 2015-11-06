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
 *豆浆调料
 */
public class Soy extends CondimentDecoretor {
   private Beverage beverage;

   public Soy(Beverage beverage) {
      super();
      this.beverage = beverage;
   }

   @Override
   public String getDescription() {
      return beverage.getDescription() + ", Soy(豆浆)";
   }

   /**
    * 调料的钱+饮料的钱
    */
   @Override
   public Double cost() {
      return 0.10 + beverage.cost();
   }

}
