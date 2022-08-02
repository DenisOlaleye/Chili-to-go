/*The Huntington Boys and Girls Club is conducting a fundraiser by selling chili
dinners to go. The price is $7 for an adult meal and $4 for a child’s meal. Write a
program that accepts the number of each type of meal ordered and display the
total money collected for adult meals, children’s meals, and all meals. Save the
program as ChiliToGo.java.*/

import java.util.Scanner;


public class ChiliToGo 
{
	public static void main (String [] args)
	{
		final int ADULT_PRICE = 7;
		final int CHILD_PRICE = 4;
		
		int adultMeal;
		int childMeal;
		int adultMealMoney;
		int childrenMealMoney;
		int totalMoney;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number of adult meals >> ");
		adultMeal = input.nextInt();
		System.out.print("Enter number of children's meals >> ");
		childMeal = input.nextInt();
		
		adultMealMoney = adultMeal*ADULT_PRICE;
		childrenMealMoney = childMeal*CHILD_PRICE;
		totalMoney = adultMealMoney+childrenMealMoney ; 
		
		
		System.out.println("The Huntington Boys and Girls Club collect $" 
				+adultMealMoney+ " for adult meals and $"
				+childrenMealMoney+ " for children meals.");
		System.out.println("Total money collected by the club is $" +totalMoney+ ".");
		
	}

}
