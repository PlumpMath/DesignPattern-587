package com.et.observer;

import java.util.ArrayList;
import java.util.List;

/**
 ★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆            @author： The One                  ☆★
★☆            @time：2014年12月2日 下午5:06:38      ☆★
★☆            @version：1.0                      ☆★
★☆            @lastMotifyTime：                                                      ☆★
★☆            @ClassAnnotation：                                                   ☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★
 *
 *被观察者
 */
public class Subject {
   private List<ObServer> obServers = new ArrayList<ObServer>();

   /**
    * 添加一个观察者
    * @param obServer
    */
   public void addObServer(ObServer obServer) {
      obServers.add(obServer);
   }

   /**
    * 移除观察者
    * @param obServer
    */
   public void removeObServer(ObServer obServer) {
      obServers.remove(obServer);
   }

   /**
    * 通知所有观察者变化
    * @param info
    */
   public void notifyObServer(String info) {
      for (ObServer obServer : obServers) {
         obServer.handle(info);
      }
   }
}
