package com.acadgild;

/**
 * 
 * Class implementing Runnable interface to check prime numbers
 *
 */
public class PrimeNumber implements Runnable {

	public void run() {
		int num;
		for (num = 2; num <= 100; num++) {
			int cnt = 0;
			for (int i = 2; i <= num / 2; i++)
				if (num % i == 0) {
					cnt++;
					break;
				}
			if (cnt == 0)
				System.out.println(num + " Number is prime");
		}
	}

}
