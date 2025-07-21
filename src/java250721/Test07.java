package java250721;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum1 = 0;
		int sum2 = 0;
		for(int i=1;i>=100;i=i+1) {
			for (int j=1;j>=100;j=j+2) {
				sum1=sum1+i;
				sum2=sum2-i;
			}
				System.out.println(sum1-sum2);
		}
		
	}

}
