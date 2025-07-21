package java250721;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
			if(sum>=100) {
				break;
			}
			System.out.println("더한 수" + i);
			System.out.println("합" + sum);
		}
		
	}

}
