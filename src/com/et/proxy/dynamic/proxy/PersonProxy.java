package com.et.proxy.dynamic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.et.proxy.dynamic.service.PersonService;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年11月16日 下午9:35:48      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *代理设计：一个操作的接口有两个接口，其中一个是真是主题的实现类，另外一个是代理类，
 *代理类实现要完成比真实主题实现更多的内容 ，而且本身还需要处理一些与具体业务有关的程序代码
 *
 *业务场景：在调用service层的所有方法做拦截，如果name为空则不允许调用
 */
public class PersonProxy implements InvocationHandler {
   private Object targetObject;

   public Object createProxyInstance(Object targetObject) {
      this.targetObject = targetObject;
      return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
   }

   @Override
   public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
      System.out.println("经过代理");
      PersonService personService = (PersonService) targetObject;
      Object result = null;
      if (personService.getName() != null) {
         result = method.invoke(targetObject, args);
      }
      return result;
   }

}
