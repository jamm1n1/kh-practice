package pratice3.model.vo;

public class Cat extends Animal {
private String location;
private String color;


public Cat() {
		
}

public Cat(String location, String color) {
	super();
	this.location = location;
	this.color = color;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

@Override
public void speak() {
	System.out.println("��");
		
	
	
}


}
