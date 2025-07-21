package javaanswer;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 정수 중 3의 배수이거나 5의 배수인 수만 출력하세요.
		for(int i=1;i<=100;i++) {
			if(i%3==0 || i%5==0) { //&&로 연산하면 공배수 찾는방법
				System.out.println(i);
			} 
			}
		}
	

}
