package ens.spring.learn;

public class Rectangle extends Shapes {

private int l;
private int b;




public Rectangle()
{
	
}
	public Rectangle(int l, int b) {
	super();
	this.l = l;
	this.b = b;
}
	public void draw()
	{
		System.out.println("Drawing Shape:"+getName());
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}

	
	
	
}
