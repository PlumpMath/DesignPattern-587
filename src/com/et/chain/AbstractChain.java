package com.et.chain;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 下午4:02:14      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 * 定义一个抽象的职责链父类,用来放当前链的下一个对象
 */
public abstract class AbstractChain implements Chain {
   // 下一个链
   private Chain nextChain;

   @Override
   public void setNextChain(Chain chain) {
      this.nextChain = chain;
   }

   // 执行下一个链的execute（）方法
   public void executeNext(Object obj) {
      if (nextChain != null) {
         nextChain.execute(obj);
      }
   }
}
