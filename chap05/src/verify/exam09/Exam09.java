package verify.exam09;

import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] scores=null;
		boolean run=true;
		while(run) {
			System.out.println("-------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice) {
				case 1:
					System.out.print("학생수 > ");
					int studentNum=Integer.parseInt(sc.nextLine());
					scores=new int[studentNum];
					break;
				case 2:
					for(int i=0;i<scores.length;i++) {
						System.out.print("scores["+i+"] > ");
						scores[i]=Integer.parseInt(sc.nextLine());
					}
					break;
				case 3:
					for(int i=0;i<scores.length;i++) {
						System.out.println("scores["+i+"] : "+scores[i]);
					}
					break;
				case 4:
					int max=0;
					int sum=0;
					for(int i=0;i<scores.length;i++) {
						sum+=scores[i];
						if(max<scores[i]) max=scores[i];
					}
					double avg=(double)sum/scores.length;
					System.out.println("최고 점수 : "+max);
					System.out.println("평균 점수 : "+avg);
					break;
				case 5:
					System.out.println("프로그램 종료");
					run=false;
			}
		}
	}
}	
