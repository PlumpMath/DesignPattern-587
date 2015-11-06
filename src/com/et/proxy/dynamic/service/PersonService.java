package com.et.proxy.dynamic.service;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年11月16日 下午9:36:49      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 */
public class PersonService implements BaseService {
   private String name;

   public PersonService() {
   }

   public PersonService(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   @Override
   public void add(String name) {
      System.out.println("PersonService.add():" + name);
   }

   @Override
   public void update(String name, int id) {
      System.out.println("PersonService.update():name:" + name + "  id:" + id);
   }

}
