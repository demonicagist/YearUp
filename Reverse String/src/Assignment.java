
public class Assignment {

	public static void main(String[] args)
	{
		ReverseOutOfPlace("cool whip");

	
	}
	
	 public static void ReverseOutOfPlace(String orginalString)
 {
	 if(orginalString != null)
	 {
		 char[] orginalStringCharacters = orginalString.toCharArray();
		 char[] reversedStringCharacters = new char [orginalString.length()];
		 
		 for(int i = 0, j = orginalStringCharacters.length -1;i < reversedStringCharacters.length; i++, j--)
		 {
            reversedStringCharacters[i] = orginalStringCharacters[j];
		 
		 }
	 
		 String reversedString = new String(reversedStringCharacters);
		 System.out.println("The reversed String is:"+ reversedString);
		 
	 }
	 
 }
}

	 
		 
            
		 
