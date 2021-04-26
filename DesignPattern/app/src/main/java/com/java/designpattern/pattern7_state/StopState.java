package com.java.designpattern.pattern7_state;


public class StopState implements State {
 
   public void doAction(StateContext context) {
      System.out.println("Player is in stop state");
      context.setState(this); 
   }
 
   public String toString(){
      return "Stop State";
   }
}