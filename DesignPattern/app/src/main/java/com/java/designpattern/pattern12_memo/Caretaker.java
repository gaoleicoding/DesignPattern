package com.java.designpattern.pattern12_memo;

/**
 * 备份信息管理类
 */
public class Caretaker {
    /** 备份 */
    private ContentMemento gameMemento;
    /** 恢复备份 */
    public ContentMemento retrieveMemento(){
        return this.gameMemento;
    }
    /** 保存备份 */
    public void saveMemento(ContentMemento gameMemento){
        this.gameMemento = gameMemento;
    }
}