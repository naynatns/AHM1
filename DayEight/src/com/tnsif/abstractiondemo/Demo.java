package com.tnsif.abstractiondemo;

public class Demo {

	public static void main(String[] args) {
		
		Square s=new Square(5.0f);
		s.calArea();
		s.show();
		
		Rectangle r=new Rectangle(5.0f,2.0f);
		r.calArea();
		r.show();
		
		
		
		//Dynamic Binding-late Binding
		Shape shape;
		
		shape=new Square(2.0f);
		shape.calArea();
		shape.show();
		
		shape=new Rectangle();
		shape.calArea();
		shape.show();
		
		
		


}
}