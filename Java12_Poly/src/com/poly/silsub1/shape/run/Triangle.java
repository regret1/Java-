package com.poly.silsub1.shape.run;

public class Triangle implements IShape{
	
	private double base;
    private double height;
    
    public Triangle() {
        this.base = 0;
        this.height = 0;
    }
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
	@Override
	public void area() {
		return (base * height) / 2;
	}
	
	public double getHypotenuse() {
        return Math.sqrt(base * base + height * height);
    }
	@Override
	public void perimeter() {
        return base + height + getHypotenuse();
    }
	
}
