package ch06.sec13.exam03.package1;

public class B {
	public void method() {
		A a=new A();
		
		a.field1=1;
		a.field2=1;
		a.field3=1; // private 접근제한자는 클래스 내에서만 접근가능
		
		a.method1();
		a.method2();
		a.method3(); // private 접근제한자는 클래스 내에서만 접근가능
	}
}
