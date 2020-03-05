package plamichh_005;

public class Shape {

	protected int NumberOfSides;
	protected double SideLength;

	protected void SetNumberOfSides(int num) {
		num = this.NumberOfSides;
	}

	protected int GetNumberOfSides() {
		return NumberOfSides;
	}

	protected void SetSideLength(double length) {
		length = this.SideLength;
	}

	protected double GetSideLength() {
		return SideLength;
	}

	public double ComputeArea() {
		System.out.println("Calling superclass ComputeArea");
		return 0;
	}

	public double ComputePerimeter() {
		System.out.println("Calling superclass ComputePerimeter");
		return 0;
	}

}
