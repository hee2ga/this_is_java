package ch13.sec05;

public class Course {
	// 모두 등록가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course1을 등록함");
	}
	// 학생만 등록가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course2을 등록함");
	}
	
	// 직장인 및 일반인만 등록가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+"이(가) Course3을 등록함");
	}
}
