package com.baier.paperSize;

public class Paper {
	private int sideA;
	private int sideB;
	private String name;
	
	public Paper(int sideA,int sideB, String name){
		this.sideA = sideA;
		this.sideB = sideB;
		this.name = name;
	}

	public int getA() {
		return sideA;
	}

	public void setA(int a) {
		this.sideA = a;
	}

	public int getB() {
		return sideB;
	}

	public void setB(int b) {
		this.sideB = b;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return getName() + ": " + getA() + " x " + getB();
	}

}
