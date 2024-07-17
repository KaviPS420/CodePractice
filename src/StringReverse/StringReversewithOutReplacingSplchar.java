package StringReverse;

public class StringReversewithOutReplacingSplchar {
	
	public static String StrReverseWOReplacingSplchar(String str) {
		//1. I want to get string 
		StringBuilder sb = new StringBuilder();
		for(char e:str.toCharArray()) {
			if(Character.isLetter(e)) {
				sb.append(e);
			}
		}
		//reverse the string
		sb.reverse();
		System.out.println(sb);
		//replace the string 
		StringBuilder rev = new StringBuilder();
		int index=0;
		for(char e:str.toCharArray()) {
			if(Character.isLetter(e)) {
				rev.append(sb.charAt(index++));
			}else {
				rev.append(e);
			}
		}
		
				return rev.toString();
	}
	

	public static void main(String[] args) {
	System.out.println(StrReverseWOReplacingSplchar("$Kavith/a"));

	}

}
