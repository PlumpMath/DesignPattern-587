package com.et.chain;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 下午4:08:25      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 */
public class Test {
   public static void main(String[] args) {
      // 先定义三个链,
      Chain validationChain = new ValidationChain();
      Chain createFormChain = new CreateFormChain();
      Chain createActionChain = new CreateActionChain();
      // 把一个链串联起来
      validationChain.setNextChain(createFormChain);
      createFormChain.setNextChain(createActionChain);
      // 启动责任链,把请求交给链里面的第一个对象
      validationChain.execute(new Object());
   }
}
