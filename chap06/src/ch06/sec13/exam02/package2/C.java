package ch06.sec13.exam02.package2;

import ch06.sec13.exam02.package1.A;

public class C {
	A a1=new A(true);
	A a2=new A(1); // default 생성자는 같은 패키지 내에서만 사용가능
	A a3=new A("문자열"); // private 생성자는 클래스 내부에서만 사용가능
}
