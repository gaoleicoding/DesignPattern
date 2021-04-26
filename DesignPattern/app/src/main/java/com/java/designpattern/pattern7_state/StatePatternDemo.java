package com.java.designpattern.pattern7_state;

public class StatePatternDemo {
   public static void main(String[] args) {
      StateContext context = new StateContext();
 
      StartState startState = new StartState();
      startState.doAction(context);
 
      System.out.println(context.getState().toString());
 
      StopState stopState = new StopState();
      stopState.doAction(context);
 
      System.out.println(context.getState().toString());
   }
}