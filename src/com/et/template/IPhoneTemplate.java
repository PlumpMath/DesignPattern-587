package com.et.template;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 上午11:21:01      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *模板模式
 *
 *父类定义流程，子类实现流程
 *解决问题：业务有多种，但有规定的流程
 *项目用法：一般基类的实现都是模板模式（DaoBase）
 */
public abstract class IPhoneTemplate {
   // 装配零件
   abstract void assemble();

   // 包装
   abstract void box();

   // 出厂
   abstract void out();

   // 制造流程
   public void create() {
      assemble();
      box();
      out();
   }
}
