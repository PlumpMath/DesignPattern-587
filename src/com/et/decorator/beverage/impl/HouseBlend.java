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
 *综合咖啡--饮料
 */
public class HouseBlend extends Beverage {
   /**
    * 综合咖啡饮料的价钱
    */
   @Override
   public Double cost() {
      return 0.9;
   }

   public HouseBlend() {
      super.description = "综合咖啡";
   }

}
