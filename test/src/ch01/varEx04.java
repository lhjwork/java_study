package ch01;


class Note {
	int price = 2000;
}

 

public class varEx04 {
	

	public static void main(String[] args) {
		Note note1 = new Note(); // heap 공간에 Note 클래스 가지고 있는 모든 데이터를 할당해!! (대신 static은 제외하고)
		Note note2 = new Note(); // -> Note type의 자료형이 heap 공간에 생긴다. 
		Note note3 = new Note();
		int age = 25;
		System.out.println(note1.price);
		System.out.println(note2.price);
		System.out.println(note3.price);
	
		note3.price =30000;
		
		System.out.println(note3.price);
	}

}
