package com.java.designpattern.pattern12_memo;

/**
 * 文本工具
 */
public class TextUtil {

    private String content;

    /**
     * 备份内容
     * @return
     */
    public ContentMemento createGameMemento(){
        return new ContentMemento(content);
    }

    /**
     * 输入错误
     */
    public void mistake(String next){
        content = next;
    }

    /**
     * 恢复备份
     * @param gameMemento
     */
    public void restore(ContentMemento gameMemento){
        this.content = gameMemento.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}