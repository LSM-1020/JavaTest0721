package javaanswer;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 합 구하다가 합이 100 이상이면 멈추기
		
		int sum = 0;
		int lastNumber = 0;
		for(int i=0;i<=100;i++) {
			sum = sum + i;
			if(sum >=100) {
				lastNumber = i;
				break;
			}
		}
		System.out.println("마지막으로 더한 수" + lastNumber);
		System.out.println("합" + sum);
	}

}
//print문이 안에 있으면 break걸린 이후의 반복문print는 실행되지 않음
//print문이 밖에 있으면 모든 조건이 끝나고 실행됨