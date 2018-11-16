package ens.spring.learn;

public abstract class Shapes {
	
	private String name;
	public abstract void draw();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
