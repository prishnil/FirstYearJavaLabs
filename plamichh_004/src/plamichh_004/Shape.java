package plamichh_004;

	
	public abstract class Shape {
		protected int NumberOfSides;
		protected double SideLength;

		protected abstract void SetNumberOfSides(int num);
		protected abstract int GetNumberOfSides();
		protected abstract void SetSideLength(double length);
		protected abstract double GetSideLength();
		
		public abstract double Area();
		public abstract double Perimeter();

		
}
