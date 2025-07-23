package sec05.exam02;

public class JoinExample {
	public static void main(String[] args) {
		SumThread sumThread=new SumThread();
		sumThread.start();
		
		try {
			sumThread.join(); // 메인 스레드가 sumThread 끝날때까지 기다림
		}catch(InterruptedException e) {
			
		}
		System.out.println("1~100 합 : "+sumThread.getSum());
	}
}
