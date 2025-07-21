package javaanswer;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 50까지 수 중 50의 약수를 모두 출력하세요.
		for(int i=1;i<=50;i++) {
			if(50%i==0) { //나누어 떨어지면 i는 50의 약수
				System.out.println(i);
			}
		}

	}

}
