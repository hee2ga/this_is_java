package sec06;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
		
		// Boxing
		Integer obj=100;
		System.out.println("value : "+obj.intValue());
		
		// Unboxing
		int value=obj;
		System.out.println("value : "+value);
		
		int result=obj+100;
		System.out.println("result : "+result);
		
	}
}
