public class ForLoops2 {

	public static void main(String[] args)

	{
		int[] array1 = new int[] { 40, 60, 80, 100 };
		int[] array2 = new int[] { 40, 20, 80, 100 };
		FindANumberInArray(array2, 60);
		FindANumberInArray(array1, 60);
		System.out.println("Searching in array 1....");

		System.out.println("Searching in array 2....");
	}

	public static void FindANumberInArray(int[] numbers, int searchNumber) {
		if (numbers != null) {
			int foundAtLocation = -1;

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == searchNumber) {
					foundAtLocation = i;
					break;

				}
			}
			if (foundAtLocation >= 0) {
				System.out.println("The number was found at location" + foundAtLocation);
			} else {
				System.out.println("The number was not found in the array");

			}
		}
	}








	public static void main1(String[] args)

	{
		int[] array1 = new int[] { 40, 60, 80, 100 };
		int[] array2 = new int[] { 40, 20, 80, 100 };
		int[] array3 = new int[] {40,60,80, 60, };
				FindANumberInArray(array2, 60);
		FindANumberInArray(array1, 60);
		FindANumberInArray(array3, 60);
		System.out.println("Searching in array 1....");

		System.out.println("Searching in array 2....");
	}

	public static void FindOcurrenceOfNumberInArray(int[] numbers, int searchNumber) {
		if (numbers != null) {
			int countOfOccurences = 0;

			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == searchNumber) {
					countOfOccurences ++;
					
}
			}
			if (countOfOccurences >= 0) {
				
			} else {
				

			}
		}
	}
}