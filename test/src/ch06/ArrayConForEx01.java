package ch06;

public class ArrayConForEx01 {
	
	static void 남은금액계산(int[] coin, int restMoney) {
	
		for(int i=0; 4 > i; i++) {
			// 스탭 
			System.out.println(coin[i]+"원 :"+ (restMoney/coin[i]));
		
			restMoney = restMoney%coin[i];
			System.out.println("남은금액 :"+ restMoney);
		}
	}

	public static void main(String[] args) {
		//동전구하기 500, 100, 50, 10 짜리 동전이 몇개가 필요한지(최소동전갯수)?
		int[] coin = {500, 100, 50, 10};
		int money = 1350;
		int restMoney = money;
		

		//아래의 스텝 4개를 배열과 for문을 이용해서 수정하세요!! - 리팩토링 (재생산)
		남은금액계산(coin,restMoney);
	

	
	}


}
