package com.java.designpattern.pattern17_dynamic_proxy;

/**
 * 静态代理，这个代理类也必须要实现和被代理类相同的Person接口
 * @author yujie.wang
 *
 */
public class Client implements Person{
	
	private Person o;
	
	public Client(Person o){
		this.o = o;
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//s为被代理的对象，某些情况下 我们不希望修改已有的代码，我们采用代理来间接访问
		Student s = new Student();
		//创建代理类对象
		Client proxy = new Client(s);
		//调用代理类对象的方法
		proxy.sayHello("welcome to java", 20);
		System.out.println("******");
		//调用代理类对象的方法
		proxy.sayGoodBye(true, 100);
 
	}
 
	@Override
	public void sayHello(String content, int age) {
		// TODO Auto-generated method stub
		System.out.println("Client sayHello begin");
		//在代理类的方法中 间接访问被代理对象的方法
		o.sayHello(content, age);
		System.out.println("Client sayHello end");
	}
 
	@Override
	public void sayGoodBye(boolean seeAgin, double time) {
		// TODO Auto-generated method stub
		System.out.println("Client sayHello begin");
		//在代理类的方法中 间接访问被代理对象的方法
		o.sayGoodBye(seeAgin, time);
		System.out.println("Client sayHello end");
	}
 
}