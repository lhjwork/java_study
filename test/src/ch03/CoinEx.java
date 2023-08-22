package ch03;

public class CoinEx {

	public static void main(String[] args) {
		//동전구하기 500, 100, 50, 10 짜리 동전이 몇개가 필요한지(최소동전갯수)?
		int money = 3680;
		int restMoney = money;
		
		int count500 = 0;
		int count100 = 0;
		int count50 = 0;
		int count10 = 0;
		
		

		
		// 스탭 1
		System.out.println("500원 :"+ (restMoney/500));
		count500 = restMoney/500;
		restMoney = restMoney%500;
		System.out.println("남은금액 :"+ restMoney);
		
		
		// 스탭 2
		System.out.println("100원 :"+ (restMoney/100));
		count100 = restMoney/100;
		restMoney = restMoney%100;
		System.out.println("남은금액 :"+ restMoney);
		
		// 스탭 3
		System.out.println("50원 :"+ (restMoney/50));
		count50 = restMoney/50;
		restMoney = restMoney%50;
		System.out.println("남은금액 :"+ restMoney);
		
		// 스탭 4
		System.out.println("10원 :"+ (restMoney/10));
		count10 = restMoney/10;
		restMoney = restMoney%10;
		System.out.println("남은금액 :"+ restMoney);
		
		
		// 마무리
		System.out.println(money+"의 최소동전 개수는?" );
		System.out.println("500원 "+ count500 +"개");
		System.out.println("100원 "+ count100 +"개");
		System.out.println("50원 "+ count50 +"개");
		System.out.println("10원 "+ count10 +"개");
	}

}
