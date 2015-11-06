package com.et.chain;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 下午4:01:10      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *责任链模式
 *
 *一句话总结：一个请求用以链的方式，把对象串起来处理
 *解决问题：一个请求处理过程比较多，不确定那个对象最后处理这个请求
 *模式结构：定义一个接口chain，声明execute（），setNextChain（），
 *定义一个AbstractChain抽象链，设定下一个链的字段，子类继承AbstractChain，覆写execute方法
 */
public interface Chain {
   // 业务方法
   void execute(Object obj);

   // 设置下一个链
   void setNextChain(Chain chain);
}
