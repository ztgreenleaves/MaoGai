package test2;

import java.util.Random;

public class test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Random random = new Random();
		int a[] = new int[8]; 
		a[0] = random.nextInt(8);
		for (int i = 1; i < a.length; i++) {
			a[i] = random.nextInt(8);
			for (int j = 0; j < i; j++) {
				while (a[i] == a[j]) {
					i--;
				}	
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] +"  ");
		}
	}
	
}





