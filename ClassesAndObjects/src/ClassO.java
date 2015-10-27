

public class ClassO
{

	public static void main(String[] args)
	{
		Circle bigCircle=new Circle("blue", 3.0);
		
		
		System.out.println("Big circle's radius is " + bigCircle.m_radius);
		System.out.println("Big circle's color is " + bigCircle.m_color);
		System.out.println("Big circle's area is " + bigCircle.CalculateArea());
		bigCircle.PrintColor();

		Circle smallcircle = new Circle( 2.0);
		System.out.println("Small circle's radius is " + smallcircle.m_radius);
		System.out.println("Small circle's color is " + smallcircle.m_color);

	
		System.out.println("Big circle's area is" + smallcircle.CalculateArea());

		smallcircle.PrintColor();
	}
	
	
	public static class Circle
	{
		String m_color;
		double m_radius = -1;
		
	
		public Circle(String string, int i) {
			// TODO Auto-generated constructor stub
		}

		private double CalculateArea() 
		{
			double area= m_radius*m_radius *3.14;
			return area;
		}

		private void PrintColor() 
		{
			
		}
		private Circle(double radius) 
		{
			 m_radius= radius;
			 m_color = "grey";
		}
		private  Circle(String color, double radius) 
		{
			 m_radius= radius;
			 m_color = color;
		}
	}
}
