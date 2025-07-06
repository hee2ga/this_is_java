package verify.exam20;

import java.util.Scanner;

public class BankApplication {
	private static Scanner sc=new Scanner(System.in);
	private static Account[] accountArray=new Account[100];
	public static void main(String[] args) {
		
		boolean run=true;
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------------");
			
			System.out.print("선택 > ");
			int choice=Integer.parseInt(sc.nextLine());
			
			switch(choice) {
				case 1:
					creatAccount();
					break;
				case 2 : 
					accountList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					System.out.println("프로그램 종료");
					run=false;
			}
		}
	}
	
	private static void creatAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		
		System.out.print("계좌번호 > ");
		String ano=sc.nextLine();
		
		System.out.print("계좌주 > ");
		String name=sc.nextLine();
		
		System.out.print("초기 입금액 > ");
		int balance=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=new Account(ano, name, balance);
				System.out.println("결과 : 계좌가 생성되었습니다.");
				return;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAccountNumber()+"\t"+accountArray[i].getAccountName()+"\t"+accountArray[i].getBalace());
			}
			return;
		}
		
	}
	
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		
		System.out.print("계좌번호 > ");
		String ano=sc.nextLine();
		
		System.out.print("예금액 > ");
		int depositAmount=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAccountNumber().equals(ano)) {
					int balance=accountArray[i].getBalace()+depositAmount;
					
					accountArray[i].setBalace(balance);
					
				}
			}
			return;
		}
	}
	
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		
		System.out.print("계좌번호 > ");
		String ano=sc.nextLine();
		
		System.out.print("출금액 > ");
		int withdrawAmount=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				if(accountArray[i].getAccountNumber().equals(ano)) {
					int balance=accountArray[i].getBalace()-withdrawAmount;
					
					accountArray[i].setBalace(balance);
					
				}
			}
			return;
			
		}
	}
}
