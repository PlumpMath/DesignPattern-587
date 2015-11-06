package com.et.singleton;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年11月25日 下午9:55:48      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 */
public class LazySun {
   private static LazySun sun = null;

   // 切记：构造器一定要私有化
   private LazySun() {
   }

   // 懒汉式单例模式：只有在调用的时候才会实例化
   public synchronized static LazySun getSun() {
      if (sun == null) {
         sun = new LazySun();
      }
      return sun;
   }
}
