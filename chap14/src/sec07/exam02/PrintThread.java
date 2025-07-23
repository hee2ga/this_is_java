package sec07.exam02;

public class PrintThread extends Thread {
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println("실행중");
				Thread.sleep(1);
			}
		}catch(InterruptedException e) {
			// interrupt() 호출되면 여기로 빠짐
		}
		
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}
}
