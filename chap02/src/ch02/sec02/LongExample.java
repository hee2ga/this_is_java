package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1=10;
		long var2=20L;
		// 컴파일러는 int로 간주하기때문에 컴파일 에러 발생
		long var3=1000000000000;
		long var4=1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
