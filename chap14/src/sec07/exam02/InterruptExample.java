package sec07.exam02;

import sec07.exam01.PrintThread;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread=new PrintThread();
		thread.start(); // 스레드 시작 → run() 실행됨
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		thread.interrupt();
	}
}
