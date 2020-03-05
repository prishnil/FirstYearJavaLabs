package plamichh_005;

class Circle extends Shape {

	public Circle(double l) {
		super.SetSideLength(l);
		super.SetNumberOfSides(0);
	}

	public double computeArea() {
		return (((Math.PI) * (Math.pow(super.GetSideLength(), 2))) / 4);
	}

	public double computePerimeter() {
		return ((Math.PI) * super.GetSideLength());
	}
}
