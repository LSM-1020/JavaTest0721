package javaanswer;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1부터 100까지 홀수 합 출력
		int sum = 0;
		for(int i=0;i<=100;i++) {
			if(i%2 ==1) {
			sum = sum+i;
			}	 
//			if(1%2 ==0) 짝수를 찾았을때는 sum=sum+i 실행되지 않음
//			continue; for문으로 돌려보내기
		}
		System.out.println(sum);
		
	}

}
