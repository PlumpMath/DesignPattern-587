package com.et.proxy.statc.proxy;

import com.et.proxy.statc.service.BaseService;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年11月16日 下午9:14:16      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *代理设计：一个操作的接口有两个接口，其中一个是真是主题的实现类，另外一个是代理类，
 *代理类实现要完成比真实主题实现更多的内容 ，而且本身还需要处理一些与具体业务有关的程序代码
 *
 *这里的代理是静态的代理类，因为一个代理类只能为一个借口服务，那么如果现在有很多个接口的话，
 */
public class PersonProxy implements BaseService {
   private BaseService baseService;

   public PersonProxy(BaseService baseService) {
      this.baseService = baseService;
   }

   @Override
   public void add(String name) {
      System.out.println("我是代理");
      if ("martian".equals(name)) {// 判断名字是否合法，合法才调用真正的方法
         baseService.add(name);
      }
   }
}
