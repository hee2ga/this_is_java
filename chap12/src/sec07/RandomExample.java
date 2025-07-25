package sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {
	public static void main(String[] args) {
		int[] selectNumber=new int[6];
		Random random=new Random(3);
		System.out.print("선택번호 : ");
		for(int i=0;i<6;i++) {
			selectNumber[i]=random.nextInt(45)+1; // 1 ~ 46
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		int[] winningNumber=new int[6];
		System.out.print("당첨번호 : ");
		for(int i=0;i<6;i++) {
			winningNumber[i]=random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		// 비교 전 배열항목 정렬
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result=Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨 여부 : ");
		if(result) {
			System.out.println("1등에 당첨되셨습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}
