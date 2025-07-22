package verify.exam10;

public class StringBuilderExample {
	public static void main(String[] args) {
		String str="";
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<=100;i++) {
			builder.append(i);
		}
		str=builder.toString();
		System.out.println(str);
	}
}
