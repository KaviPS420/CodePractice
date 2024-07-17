package StringReverse;

public class FirstcharUpercase {

	public static String firstCharUpperCase(String str) {
		
		String name= str.substring(0, 1).toUpperCase()+str.substring(1);
		
		return name;
	}
	public static void main(String[] args) {
	
		System.out.println(firstCharUpperCase("money makes maney"));
	}

}
