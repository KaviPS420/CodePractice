package StringReverse;

public class ReverseEachWord extends ReverseString {
	
	public static String reverse(String str) {
		int len=str.length();
		String ss[] = str.split(" ");
		String rev = " ";
		for(String e:ss) {
		rev = rev+stringReverse(e)+" ";
						
		}
		return rev.trim();
	}

	public static void main(String[] args) {
		String s = "where there is a will there is a way";
		// Return : erehw ereht si a lliw ereht si a yaw
		System.out.println(reverse(s));

	}

}
