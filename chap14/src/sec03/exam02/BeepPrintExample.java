package sec03.exam02;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() { // 작업 스레드 생성
				Toolkit toolkit=Toolkit.getDefaultToolkit();
				for(int i=0;i<5;i++) {
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
				}
				
			}
		});
		thread.start(); // 작업 스레드 실행
		
		for(int i=0;i<5;i++) { // 메인 스레드가 실행하는 코드
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}
