package verify.exam07;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		int balance=0;
		boolean run=true;
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1. 예금 | 2. 출금 |  3. 잔고 | 4. 종료");
			System.out.println("---------------------------------");
			
			System.out.print("선택 > ");
			String choice=scanner.nextLine();
			
			switch(choice) {
				case "1":
					System.out.print("예금액 > ");
					String strDeposit=scanner.nextLine();
					balance+=Integer.parseInt(strDeposit);
					break;
				case "2":
					System.out.print("출금액 > ");
					String strWithdrawal=scanner.nextLine();
					balance-=Integer.parseInt(strWithdrawal);
					break;
				case "3":
					System.out.println("잔고 > "+balance);
					break;
				case "4":
					System.out.println("프로그램 종료");
					run=false;
					
			}
		}
	}
}
