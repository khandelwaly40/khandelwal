package com.tdd.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TddAdditionApplication {

	public static void main(String[] args) {
		SpringApplication.run(TddAdditionApplication.class, args);
	}
	
	/**
	 * Method to add 2 numbers separated by comma
	 * @param numbers
	 * @return
	 */
	public static int add(final String numbers) {
		String[] numbersArray = numbers.split(",");
		int sumOfNumbers = 0;
		int num = 0;
		if (numbersArray.length > 2) {
			throw new RuntimeException("Maximum 2 numbers are allowed in this list");
		} else {
			for (String number : numbersArray) {
				try {
					num = Integer.parseInt(number);
				} catch (NumberFormatException e) {
					System.out.println("Trying to parse " + number + " which is not number.");
					e.printStackTrace();
				}
				sumOfNumbers += num;
			}
		}
		return sumOfNumbers;
	}

}
