package StringReverse;

public class ReverseString {
	
	public static String stringReverse(String str) {
		int len = str.length();
		if(len==0) {
			return null;
		}
		if(len==1) {
			return str;
		}
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
					}
		return rev;
	}

	public static void main(String[] args) {
		String s = "selenium";
		System.out.println(s);
		System.out.println(stringReverse(s));

	}

}
