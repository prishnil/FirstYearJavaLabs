package plamichh_004;

public class Square extends Shape {

	public Square(double d) 
	{
	 this.SideLength = d;
	 this.NumberOfSides = 4;
	}
			


	protected void SetNumberOfSides(int num)
	 {
		num = this.NumberOfSides;
	 }

	 
	 protected  int GetNumberOfSides() 
	 {
		return 4;
	 }
	 
	 protected void SetSideLength(double Length)
	 {
		 Length = this.SideLength;
	 }
	 
	 protected double GetSideLength () 
	 {
		
		 return SideLength;
	 }
	 

	 public double Area()
	 {
		 double Area;
		 Area = this.SideLength * this.SideLength;
		 return Area;
	 }
	 public double Perimeter() 
	 {
		 double Perimeter;
		 Perimeter = this.SideLength * this.NumberOfSides;
		 return Perimeter;
	 }

		
}


