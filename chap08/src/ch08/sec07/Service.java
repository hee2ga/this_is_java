package ch08.sec07;

public interface Service {
	
	// default 메소드
	default void defaultMethod1() {
		System.out.println("defualtMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	
	// private 메소드
	private void defaultCommon() {
		System.out.println("defaultMethod 중복코드 A");
		System.out.println("defaultMethod 중복코드 B");
	}
	
	// 정적 메소드
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		staticCommon();
	}
	
	// private 정적 메소드
	private static void staticCommon() {
		System.out.println("staticMethod 중복코드 C");
		System.out.println("staticMethod 중복코드 D");
	}
}
