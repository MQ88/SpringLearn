package ens.spring.learn;

public class Rectangle implements Shapes {

private String name;
	
	public void draw()
	{
		System.out.println("Drawing Shape:"+name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
