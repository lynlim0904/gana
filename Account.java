package object_class;
//은행계좌 클래스 생성(신한은행)
public class Account {
	//멤버변수(필드)
	static final String BANKNAME="신한은행"; //정적멤버변수  
	String accountNo; //변수타입-계좌번호(인스턴스 멤버변수)
	String ownerName; //변수타입-예금주이름(인스턴스 멤버변수)
	int balance;	  //변수타입-잔액(인스턴스 멤버변수)
	
	//생성자(객체를 생성과 동시에 멤버변수 초기화)
	/*1.
	public Account(String accNO, String owName, int bal) {
		accountNo=accNO;
		ownerName=owName;
		balance=bal;
	}
	*/
	public Account(String accountNo, String ownerName, int balance) { //
		this.accountNo=accountNo; //this.필드
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	//빈생성자(기본)
	public Account() {
		
	}
	
	//예금한다 메서드(기능)
	void deposit(int amount) { //-void 리턴값이 없는 메서드 -deposit(메서드이름) -amount 매개변수
		balance+=amount; //balance=balance+amount;
	}//void deposit end
	
	//인출한다 메서드(기능)
	int withdraw(int amount) throws Exception { //-withdraw(메서드이름) -amount 매개변수 -throws Exception 예외처리
		if(balance < amount) { //예외처리
			throw new Exception("잔액이 부족합니다."); //if 조건식이 참일 경우 수행
		}
		balance-=amount; //balance=balance-amount;
		return amount; //void 가 아니면 리턴문(리턴값)이 있어야한다.
	}//int withdraw end
	
	
	
}//class end
