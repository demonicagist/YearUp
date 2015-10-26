import java.util.Scanner;

public class tipcalculator {
	public static void main(String[] args) {

		Scanner d = new Scanner(System.in);

		System.out.println("Enter in bill amount: ");
		double e = d.nextFloat();

		double cost = fifteenpercent(e);
		double cost2 =twentypercent(e);
		double cost3 =ten(e);
		System.out.println("This is the fifteen twenty and ten percent amount of your bill is " + cost + " " + cost2 + " "+ cost3);

	}

	public static double fifteenpercent(double tip1) {
		double fifteen;
		fifteen = (.15 * tip1) + tip1;
		return fifteen;
	}
	
public static double twentypercent(double tip2){
	double twenty;
	twenty = (.20 * tip2) + tip2;
	return twenty;
}
public static double ten(double tip3){
	double ten;
	ten = (.10 * tip3) + tip3;
	return ten;
}
}