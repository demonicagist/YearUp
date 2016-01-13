
public class Conditionals {

	private static final int SCORE = 100;
	private static final int FOR_LOOP_COUNT =10 ;
	private static final int WHILE_CONSTANT = 5;
	private static final int DO_WHILE_CONSTANT = 6;


	public static void main(String[] args) {
		
		System.out.println("Hello Class!");
		tryMyIfStatement();
	    tryForStatement();
	    tryWhileStatement();
	    tryDoWhileStatemnt();
	}
	
	
	
	
	

	private static void tryDoWhileStatemnt() {
		int i=0;
		do{
			System.out.println(" Do While count is :"+ i);
			i++;
		}
		while(i < DO_WHILE_CONSTANT);
		
		
	}






	private static void tryWhileStatement() {
		System.out.println("I am in while");
		int i=0;
		while( i < WHILE_CONSTANT)
		{
			System.out.println(" While count is :"+ i);
			i++;
		}
		
	}





	private static void tryForStatement() {
		System.out.println("We are trying for Statement");
		
		for (int i=0;  i<FOR_LOOP_COUNT; i++)
		{
		System.out.println("For Loop var:" +i);
		}
	}



	private static void tryMyIfStatement() {
		if (SCORE>90)
		{
			System.out.println("We have an A class");
		}
		else
		{
			System.out.println("We do not have A class");
		}
		
	}

}

