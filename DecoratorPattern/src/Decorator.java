//
//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Decorator
//  @ File Name : Decorator.java
//  @ Date : 2016/3/11
//  @ Author : blueberry
//
//




public abstract class Decorator extends Component  {
	
	private Component component;
	
	public Decorator(Component component) {
		this.component  = component ;
	}
	public void operate() {
		component.operate();
	}
}
