package javaanswer;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 짝수와 홀수 개수 세기
		int evenCount = 0;
		int oddCount = 0;
		for(int i=1;i<=100;i++) {
			if(i%2==0) { //짝수
				evenCount++;
			}else { //홀수
				oddCount++;
			}
		}
		System.out.println("짝수 개수"+evenCount);
		System.out.println("짝수 개수"+oddCount);
	}
			
}
