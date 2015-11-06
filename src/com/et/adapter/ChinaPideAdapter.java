package com.et.adapter;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月1日 下午4:46:48      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *对象适配器
 *总结：把原来两个不兼容的类，让他们兼容起来一起工作
 *解决问题：已经存在相同功能的代码，但接口不兼容，不能直接调用
 *项目用法：在使用就得api时候，没有源码，和新的不兼容
 */
public class ChinaPideAdapter implements ChinaPide {

   @Override
   public void out(int x) {
      USPide usPide = new USPide();
      usPide.out(x, 0);
   }

}
