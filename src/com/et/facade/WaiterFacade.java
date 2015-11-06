package com.et.facade;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月1日 下午5:48:10      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *外观模式
 *
 *一句话总结：为系统中的一组接口提供一个统一的高层借口
 *解决问题：对象之间交互过多，底层借口太多
 *项目怎么用：把jdbc很多细节封装在高层类里面
 *框架用法：ibatis传入sql就可以，我们可以不调用Connection，PrepareStatement
 *JDK用法：通过request获取httpSession，httpServletRequest，httpServletResponse,
 */
public class WaiterFacade implements Facade {

   @Override
   public void select() {
      Waiter waiter = new Waiter();
      waiter.select();
   }

   @Override
   public void pay() {
      Finance finance = new Finance();
      finance.pay();
   }

   @Override
   public void welcome() {
      Welcome welcome = new Welcome();
      welcome.welcome();
   }

}
