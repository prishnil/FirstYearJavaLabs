package plamichh_005;

import plamichh_005.Shape;

class Square extends Shape {

	public Square(double SideLength) {
		this.SideLength = SideLength;
		this.NumberOfSides = 4;
	}

	public double ComputeArea() {
		super.ComputeArea();
		double Area = this.SideLength * this.SideLength;
		return Area;
	}

	public double ComputePerimeter() {
		super.ComputePerimeter();
		double Perimeter = this.SideLength * this.NumberOfSides;
		return Perimeter;
	}

}
