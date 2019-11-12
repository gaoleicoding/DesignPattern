package com.java.designpattern.pattern15_visitor;

class ZhangSan implements Visitor {
   @Override
   public void visit(Games games) {
       games.play();
   }

   @Override
   public void visit(Photos photos) {
       photos.watch();
   }
}