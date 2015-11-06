package com.et.command;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月4日 上午10:08:06      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *总结：每一个行为封装成一个对象，并且对外提供统一的方法调用
 *解决问题：行为过多，或者行为比较复杂
 *框架用法：struts，struts2，发送请求会封装action去执行execute方法
 */
public class Test {
   public static void main(String[] args) {
      TV tv = new TV();

      Command startCommand = new StartCommand(tv);
      Command upCommand = new UPCommand(tv);
      Command stopCommand = new StopCommand(tv);

      startCommand.execute();
      upCommand.execute();
      stopCommand.execute();

   }
}
