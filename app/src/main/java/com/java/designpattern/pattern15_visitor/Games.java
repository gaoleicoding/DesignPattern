package com.java.designpattern.pattern15_visitor;

class Games implements Computer {
   @Override
   public void accept(Visitor visitor) {
       visitor.visit(this);
   }

   public void play() {
       System.out.println("play lol");
   }
}