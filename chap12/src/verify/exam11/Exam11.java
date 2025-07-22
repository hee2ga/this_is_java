package verify.exam11;

import java.util.StringTokenizer;

public class Exam11 {
	public static void main(String[] args) {
		String str="아이디,이름,패스워드";
		
		StringTokenizer st=new StringTokenizer(str,",");
		
		while (st.hasMoreElements()) {
			String token=st.nextToken();
			System.out.println(token);
		}
	}
}
