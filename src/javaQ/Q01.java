package javaQ;

public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {90, 80, 70, 100, 85};
		int sum = 0;
		int avr = 0;
		for(int i=0;i<=4;i++) {
			sum = sum + num[i]; 
			avr = sum / num.length;
		}
		System.out.println(avr);
		
 	}

}
