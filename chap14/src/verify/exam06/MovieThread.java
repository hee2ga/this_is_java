package verify.exam06;

public class MovieThread extends Thread {
	@Override
	public void run() {
		while(true) {
			System.out.println("동영상을 제생합니다.");
			if(this.isInterrupted()) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
