package com.java.designpattern.pattern9_interpretor;

class TerminalExpression extends AbstractExpression {

    @Override

    public void Interpret(Context context) {

        context.setOutput("终端" + context.getInput());

        System.out.println(context.getInput() + "经过终端解释器解释为：" + context.getOutput());

    }

}