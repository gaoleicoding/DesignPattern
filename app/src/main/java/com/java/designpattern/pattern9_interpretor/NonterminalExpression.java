package com.java.designpattern.pattern9_interpretor;

class NonterminalExpression extends AbstractExpression {

    @Override

    public void Interpret(Context context) {

        context.setOutput("非终端" + context.getInput());

        System.out.println(context.getInput() + "经过非终端解释器解释为：" + context.getOutput());

    }

}