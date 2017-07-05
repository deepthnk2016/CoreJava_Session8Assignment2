package com.acadgild;

/**
 * 
 * Class to invoke run method of PrimeNumber class using Thread object
 *
 */
public class Session8Assignment2 {

	public static void main(String[] args) {
		try {
			PrimeNumber pn = new PrimeNumber();

			// Instantiate the thread
			Thread th = new Thread(pn);

			// start the thread
			th.start();
		} catch (Exception e) {
		}

	}

}
