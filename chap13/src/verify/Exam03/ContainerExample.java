package verify.Exam03;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String>container1=new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1=container1.getKey();
		String job=container1.getValue();
		
		Container<String, Integer>container2=new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2=container2.getKey();
		int age=container2.getValue();
	}
}
