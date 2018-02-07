package edu.purduecal.cs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double total=0;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
				+ "4.Espresso\n" + "5.Exit");
		int choice = keyboard.nextInt();
		while (choice != 5) {
			switch (choice) {
			case 1:
				HouseBlend houseblend = new HouseBlend();
				System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n" + "4.Whip\n"
						+ "5.Exit");
				int ch = keyboard.nextInt();
				while (ch != 5) {
					if (ch == 1) {
						CondimentDecorator milk = new Milk();
						houseblend.setcondimentdecorator(milk);
						total=total+milk.cost();
						
					} if (ch == 2) {
						Mocha mocha = new Mocha();
						mocha.setBeverage(houseblend);
					}  if (ch == 3) {
						Soy addsoy = new Soy();
						addsoy.setBeverage(houseblend);
					}  if (ch == 4) {
						Whip whip = new Whip();
						whip.setBeverage(houseblend);
					}

					 if (ch == 5) {
						System.exit(0);
					}
					 System.out.println("Please Choose your Add-ons: \n" + "1.Milk\n" + "2.Mocha\n" + "3.Soy\n" + "4.Whip\n"
								+ "5.Exit");
						 ch = keyboard.nextInt();
				}
					System.out.println("coffee is:" + houseblend.getDescription());
					double fulltotal=total+houseblend.cost();
					System.out.println("your total is:" + fulltotal);
					System.out.println("Please Select your Coffee: \n" + "1.HouseBlend\n" + "2.DarkRoast\n" + "3.Decaf\n"
							+ "4.Espresso\n" + "5.Exit");
					choice = keyboard.nextInt();
			case 5 :System.exit(0);
					
				}
			
			}
		}
	}

