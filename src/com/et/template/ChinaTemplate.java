package com.et.template;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 上午11:26:56      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *在模版模式的子类里面,不需要定义和改变流程,只负责实现,流程交给父类去定义
 */
public class ChinaTemplate extends IPhoneTemplate {

   @Override
   void assemble() {
      System.out.println("中国生产iphone的装配零件");
   }

   @Override
   void box() {
      System.out.println("中国生产iphone的包装");
   }

   @Override
   void out() {
      System.out.println("中国生产iphone的出厂");
   }

}
