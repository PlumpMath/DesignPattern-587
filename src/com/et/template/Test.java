package com.et.template;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 上午11:29:19      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 */
public class Test {
   public static void main(String[] args) {
      // 模板模式
      //
      // 父类定义流程，子类实现流程
      // 解决问题：业务有多种，但有规定的流程
      // 项目用法：一般基类的实现都是模板模式（DaoBase）
      IPhoneTemplate template1 = new ChinaTemplate();
      template1.create();

      IPhoneTemplate template2 = new JPTemplate();
      template2.create();
   }
}
