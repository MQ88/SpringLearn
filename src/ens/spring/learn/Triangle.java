package ens.spring.learn;

public class Triangle extends Shapes {

	private int a;
	private int b;
	private int c;
	private String type;

	public Triangle(int a,int b,int c,String type)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.type=type;
	}
	
	


	public Triangle(int a) {
		super();
		this.a = a;
	}




	public Triangle(String type) {
		super();
		this.type = type;
	}




	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + ", type=" + type + "]";
	}



	public void draw()
	{
		System.out.println("Drawing Shape:"+getName());
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}

	
	
}
