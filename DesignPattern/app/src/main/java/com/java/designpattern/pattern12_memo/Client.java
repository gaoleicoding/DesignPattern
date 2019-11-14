package com.java.designpattern.pattern12_memo;

public class Client {

    public static void main(String[] args) {

        TextUtil game = new TextUtil();
        System.out.println("开始输入内容...");
        game.setContent("她是一个好女孩");
        //备份当前状态
        System.out.println("备份当前状态...");
        ContentMemento gameMemento = game.createGameMemento();

        Caretaker caretaker = new Caretaker();

        caretaker.saveMemento(gameMemento);
        System.out.println("备份完成...");
        game.mistake("她是一个坏女孩");
        System.out.println("当前认为：" + game.getContent());
        System.out.println("还原到之前一步");
        game.restore(caretaker.retrieveMemento());

        System.out.println("恢复完成：" + game.getContent());

    }

}