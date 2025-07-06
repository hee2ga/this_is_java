package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		A a =new A();
		
		a.field1=1;
		a.field2=1; // default 접근제한자는 같은 패키지 내에서만 접근가능
		a.field3=1; // private 접근제한자는 클래스 내에서만 접근가능
		
		a.method1();
		a.method2(); // default 접근제한자는 같은 패키지 내에서만 접근가능
		a.method3(); // private 접근제한자는 클래스 내에서만 접근가능
	}
}
