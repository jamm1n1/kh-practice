package com.hw1.model.vo;

public class person {

protected String name;
private int age;
private double height;
private double weight;





public person() {

}
public person(String name, int age, double height, double weight) {
	super();
	this.name = name;
	this.age = age;
	this.height = height;
	this.weight = weight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String information() {
	String info = name + age + height + weight;
	return info;
}
@Override
public String toString() {
	return "person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	
}



	
	
	
	
	
	
	
	
}
