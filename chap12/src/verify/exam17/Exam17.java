package verify.exam17;

import java.util.regex.Pattern;

public class Exam17 {
	public static void main(String[] args) {
		String id="5Angel1004";
		String regExp="[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch=Pattern.matches(regExp,id);
		
		if(isMatch) {
			System.out.println("ID로 사용할 수 있음");
		}else {
			System.out.println("ID로 사용할 수 없음");
		}
	}
}
