/*The Huntington Boys and Girls Club is conducting a fundraiser by selling chili
dinners to go. The price is $7 for an adult meal and $4 for a child’s meal. Write a
program that accepts the number of each type of meal ordered and display the
total money collected for adult meals, children’s meals, and all meals. Save the
program as ChiliToGo.java.*/
//----------------
//----------------
/*In the ChiliToGo program in Exercise 12, the costs to produce an adult meal and
a child’s meal are $4.35 and $3.10, respectively. Modify the ChiliToGo program to
display the total profit for each type of meal as well as the grand total profit. Save
the program as ChiliToGoProfit.java.*/

import java.util.Scanner;


public class ChiliToGo 
{
	public static void main (String [] args)
	{
		final double ADULT_PRICE = 4.35;
		final double CHILD_PRICE = 3.1;
		
		int adultMeal;
		int childMeal;
		double adultMealMoney;
		double childrenMealMoney;
		double totalMoney;
		
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
