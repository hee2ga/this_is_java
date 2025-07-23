package sec09.exam01;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService=Executors.newFixedThreadPool(5);
		// 작업생성과 처리 요청
		// 스레드풀 종료
		executorService.shutdownNow();
	}
}
