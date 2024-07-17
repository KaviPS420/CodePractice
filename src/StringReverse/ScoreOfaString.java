package StringReverse;

public class ScoreOfaString {
	public static int score(String str) {
		int score=0;
		for(int i=0;i<str.length()-1;i++) {
			int va1 = str.charAt(i);
			int va2 = str.charAt(i+1);
			score = score+Math.abs(va1-va2);
			
		}
		return score;
	}

	public static void main(String[] args) {
		
		System.out.println(score("hello"));
	}

}
