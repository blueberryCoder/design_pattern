//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Component
//  @ File Name : Client.java
//  @ Date : 2016/3/8
//  @ Author : bluberry
//
//




public class Client {
	public static void main(String [] args){
		//创建一个根节点
		Composite root = new Composite("root");
		
		//创建两个枝干节点
		Composite branch1 = new Composite("Branch1");
		Composite branch2 = new Composite("Branch2");
		
		//创建两个叶子节点
		
		Leaf leaf1 = new Leaf("leaf1");
		Leaf leaf2 = new Leaf("leaf2");
		
		branch1.addChild(leaf1);
		branch2.addChild(leaf2);
		
		root.addChild(branch1);
		root.addChild(branch2);
		
		//执行方法
		root.doSomething();
		
	}
}
