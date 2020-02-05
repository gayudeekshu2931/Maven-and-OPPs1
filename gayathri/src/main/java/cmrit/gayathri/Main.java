package cmrit.gayathri;

import java.util.Scanner;

public class Main {



	

	public static void main(String[] args) {

	int tot=0;

	NewYearGifts ob;

	System.out.println("Menu");

	System.out.println("1. Chocolate_1");

	System.out.println("2. Chocolate_2");

	System.out.println("3. Chocolate_3");

	System.out.println("4. Sweet_1");

	System.out.println("5. Sweet_2");

	System.out.println("6. Sweet_3");

	System.out.println("7. List of gifts and their weights");

	System.out.println("8. Exit");

	while(true) {

	System.out.println("Enter your choice (1-8):");

	try {

		Scanner sc=new Scanner(System.in);

	switch(sc.nextInt())

	{

	case 1: System.out.println("Enter the weight :");

			ob=new Chocolate1();

			 tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 2: System.out.println("Enter the weight :");

			ob=new Chocolate2();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 3: System.out.println("Enter the weight :");

			ob=new Chocolate3();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 4: System.out.println("Enter the weight :");

			ob=new Sweet1();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 5: System.out.println("Enter the weight :");

			ob=new Sweet2();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 6: System.out.println("Enter the weight :");

			ob=new Sweet3();

			tot=ob.weightOfGift(sc.nextInt());

			System.out.println("The total weight is :"+tot);

			break;

	case 7:	System.out.println("The list of each gift weights as follows : ");

	    	System.out.println("Chocolate_1: "+Chocolate1.mywt);

	    	System.out.println("Chocolate_2: "+Chocolate2.mywt);

	    	System.out.println("Chocolate_3: "+Chocolate3.mywt);

	    	System.out.println("Sweet_1:    "+Sweet1.mywt);

	    	System.out.println("Sweet_2:    "+Sweet2.mywt);

	    	System.out.println("Sweet_3:    "+Sweet3.mywt);

	    	System.out.println("-----------------");

	    	System.out.println("Total:      "+tot);

	    	System.out.println("-----------------");

	    	break;

	case 8:sc.close();

			System.out.println();	

			System.out.println("Thank you for your gifts...");

			System.out.println("Exited Successfully");

			System.exit(0);

	default: System.out.println("Enter an input (1-8)");



	

	}

	}

	catch(Exception e)

	{

		System.out.println("Enter an integer input (1-8)");

	}

	}



	}



}
