package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu() {
		do {
			System.out.println("========== 회원 관리 메뉴 ==========");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 종료");
			System.out.println("==============================");
			System.out.print("메뉴 번호를 입력하세요. : ");
			int btn = sc.nextInt();
			sc.nextLine();
			
			switch(btn) {
			case 1 : new MemberManager().insertMember(); break;
			case 2 : searchMemberMenu(); break;
			case 3 : updateMemberMenu(); break;
			case 4 : deleteMemberMenu(); break;
			case 5 : new MemberManager().printAllMember(); break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			}
		} while(true);
	}
	
	public void searchMemberMenu() {
		do {
			System.out.println("========== 회원 정보 검색 ==========");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 메인메뉴로");
			System.out.println("==============================");
			System.out.print("메뉴 번호를 입력하세요. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : new MemberManager().searchId(); break;
			case 2 : new MemberManager().searchName(); break;
			case 3 : new MemberManager().searchEmail(); break;
			case 9 : System.out.println("메인메뉴로 이동합니다."); return;
			}
		} while(true);
	}
	
	public void updateMemberMenu() {
		do {
			System.out.println("========== 회원 정보 수정 ==========");
			System.out.println("1. 비밀번호 수정하기");
			System.out.println("2. 이름 수정하기");
			System.out.println("3. 이메일 수정하기");
			System.out.println("9. 메인메뉴로");
			System.out.println("==============================");
			System.out.print("메뉴 번호를 입력하세요. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : new MemberManager().updatePwd(); break;
			case 2 : new MemberManager().updateName(); break;
			case 3 : new MemberManager().updateEmail(); break;
			case 9 : System.out.println("메인메뉴로 이동합니다."); return;
			}
		} while(true);
	}
	
	public void deleteMemberMenu() {
		do {
			System.out.println("========== 회원 정보 삭제 ==========");
			System.out.println("1. 회원 삭제");
			System.out.println("2. 전체 회원 삭제");
			System.out.println("9. 메인메뉴로");
			System.out.println("==============================");
			System.out.print("메뉴 번호를 입력하세요. : ");
			int btn = sc.nextInt();
			
			switch(btn) {
			case 1 : new MemberManager().deleteOne(); break;
			case 2 : new MemberManager().deleteAll(); break;
			case 9 : System.out.println("메인메뉴로 이동합니다."); return;
			}
		} while(true);
	}

}
