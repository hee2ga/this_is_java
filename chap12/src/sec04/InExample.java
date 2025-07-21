package sec04;

public class InExample {
	public static void main(String[] args) throws Exception {
		int speed=0;
		int keyCode=0;
		
		while(true) {
			if(keyCode!=13&&keyCode!=10) { // enter 키를 읽지 않았을 경우에만 실행
				if(keyCode==49) { // 숫자 1
					speed++;
				}else if(keyCode==50) { // 숫자 2
					speed--;
				}else if(keyCode==51) { // 숫자 3
					break;
				}
				System.out.println("------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("------------------------");
				System.out.println("현재속도 = "+speed);
				System.out.print("선택 > ");
			}
			
			keyCode=System.in.read();
		}
		System.out.println("프로그램 종료");
	}
}
