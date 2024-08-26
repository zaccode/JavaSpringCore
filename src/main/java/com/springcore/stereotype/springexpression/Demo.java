package com.springcore.stereotype.springexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
@Value("#{22+11}")
private int x;
@Value("#{88> 43?88:43}")
private int y;

//invoke static method , variables and creating object in Spring Expression Language 
@Value("#{T(java.lang.Math).sqrt(25)}")
private double z;

@Value("#{T(java.lang.Math).PI}")
private double pi;

@Value("#{new java.lang.String('Ujval Borole')}")
private String name;

@Value("#{8>3}")
private boolean isActive;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getPi() {
	return pi;
}
public void setPi(double pi) {
	this.pi = pi;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public double getZ() {
	return z;
}
public void setZ(double z) {
	this.z = z;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
@Override
public String toString() {
	return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", pi=" + pi + ", name=" + name + ", isActive=" + isActive + "]";
}


}
