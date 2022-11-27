package com.java.designpattern.pattern9_interpretor;

public class Client {

    public static void main(String[] args) {

        Context context = new Context();

        context.setInput("ABC");

        AbstractExpression expression1 = new TerminalExpression();

        expression1.Interpret(context);

        AbstractExpression expression2 = new NonterminalExpression();

        expression2.Interpret(context);

    }

}