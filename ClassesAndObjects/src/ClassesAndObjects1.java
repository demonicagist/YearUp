
public class ClassesAndObjects1 {

	public static void main(String[] args) {
	}
	{
		
	}
	public class Circle {
		String m_clor = null;
		double m_radius = -1;
		private String m_color;
	

		{
		Circle bigCircle = new Circle();
		System.out.println("Big circle's radius is " + bigCircle.m_radius);
		System.out.println("Big circle's color is " + bigCircle.m_color);
		System.out.println("Big circle's area is " + bigCircle.CalculateArea());
		bigCircle.PrintColor();

		Circle smallcircle = new Circle();
		System.out.println("Small circle's radius is " + bigCircle.m_radius);
		System.out.println("Small circle's color is " + bigCircle.m_color);

	
		System.out.println("Big circle's area is" + bigCircle.CalculateArea());

		smallcircle.PrintColor();
		}


		private String CalculateArea() {
			// TODO Auto-generated method stub
			return null;
		}


		private void PrintColor() {
			// TODO Auto-generated method stub
			
		}
	}
}
