package com.java.designpattern.pattern21_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 *享元工厂类
 *    创建棋子
 * @author 波波烤鸭
 * @email dengpbs@163.com
 *
 */
public class ChessFlyWeightFactory {
	//享元池  根据颜色保存不同的棋子对象
	private static Map<String,ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight  getChess(String color){
		// 如果已经存在该颜色的棋子返回
		if(map.get(color)!=null){
			return map.get(color);
		}else{
			// 如果享元池中没有该颜色的棋子就创建一个新的返回 并存储在享元池中
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
	}	
}