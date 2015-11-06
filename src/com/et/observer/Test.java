package com.et.observer;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 下午5:09:12      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★

 *观察者模式
 *
 *一句话总结:对象之间一对多依赖关系，一变化通知多
 *解决问题：多个对象依赖一个对象的情况
 *用法：一般在事件上
 *结构：Subject(被观察者)，ObServer(观察者顶级接口)
 *被观察者有保存所有观察者的集合
 */
public class Test {
   public static void main(String[] args) {
      // 创建被观察者
      Subject subject = new Subject();

      // 创建观察者
      ObServer tv = new TVObServer();
      ObServer net = new NetObServer();
      ObServer pc = new PCObServer();

      // 把观察者放入被观察者的观察集合中
      subject.addObServer(tv);
      subject.addObServer(net);
      subject.addObServer(pc);

      // 别观察者发生变化,要发送通知了
      subject.notifyObServer("下雨了，快回家收衣服啊！");
   }
}
