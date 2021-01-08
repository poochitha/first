package org.locators;

import java.util.Scanner;

public class AddNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		int rem = 0;
		while (num != 0) 
		{
			num = num / 10;
			rem = num % 10;
			sum = sum + rem;
			
		}
		System.out.println(sum);
	}

}
