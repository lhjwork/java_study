package ch05;

// 요리사
class 요리사 {
	String name = "요리사";
	
}


//홍길동 or 요리사
class 홍길동 extends 요리사 {
	String name = "홍길동";
	
}


public class OOPEx03 {

	public static void main(String[] args) {
	   홍길동 h1 = new 홍길동(); // heap -> 홍길동 and 요리사
	   System.out.println(h1.name);
	   
	   요리사 y1 = new 홍길동(); // heap -> 홍길동 and 요리사 : 바라보는 곳은 요리사이다.
	   System.out.println(y1.name);
	   // 요리사 이기도 한 홍길동의 다형성을 형성하게 된다.
	  
	   // 아래의 경우는 요리사로 띄웠기 홍길동으로 받을 수 없다. -> 다형성 형성 안됨
	   //홍길동 h2 = new 요리사();
	}

}
