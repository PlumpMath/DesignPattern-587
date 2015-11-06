package com.et.decorator.beverage.impl;

import com.et.decorator.beverage.Beverage;


/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2015年7月25日 下午8:26:28      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *浓缩咖啡--饮料
 */
public class Espresso extends Beverage {
   /**
    * 浓缩咖啡饮料的价钱
    */
   @Override
   public Double cost() {
      return 0.9;
   }

   public Espresso() {
      super.description = "浓缩咖啡";
   }

}
