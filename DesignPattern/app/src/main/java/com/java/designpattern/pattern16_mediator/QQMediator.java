package com.java.designpattern.pattern16_mediator;

import java.util.HashSet;
import java.util.Set;

public class QQMediator implements QQ{
    private Set<User> list = new HashSet<>();
    @Override
    public void setMessage(User from,User to,String msg) {
        from.showMessage("发送"+msg+"成功！");
        to.showMessage("接收"+msg+"成功！");
    }

    @Override
    public void addUser(User user) {
        list.add(user);
    }

    @Override
    public void setAllMessage(User from,String msg) {
        if(!list.contains(from)) list.add(from);
        from.showMessage("发送"+msg+"成功！");
        for(User user:list){
            user.showMessage("接收"+msg+"成功！");
        }
    }
}
