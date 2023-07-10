package libpack;

import static libpack.UserAdminOperations.*;

import static libpack.User.*;
import static libpack.Librarian.*;

import java.util.Scanner;

public class Login {
	static Scanner sc=new Scanner(System.in);
	
	
	static void adminlogin()
	{
		System.out.println("Login Id:");
		String Id=sc.nextLine();
		System.out.println("Login password:");
		int pass=sc.nextInt();
		sc.nextLine();
		if((Id.equals(adminName)) && (pass==adminid))
			{
				adminPage();
			}
		else
		{
			System.out.println("Wrong input!");
			System.out.println("Do you wanna register?(Y/N)");
			String r=sc.nextLine();
			if(r.equals("Y"))
				adminlogin();
			else
			{
				System.out.println("\t\t\t~~~~Thank You~~~ :)");
				System.exit(0);
			}
			
		}
	}
	static void userlogin()	
	{
		System.out.println("Login Id:");
		String Id=sc.nextLine();
		System.out.println("Login password:");
		int pass=sc.nextInt();
		sc.nextLine();
		if((Id.equals(userName)) && (pass==userid))
		{
			userPage();
		}
		else
		{
			System.out.println("Wrong input!");
			System.out.println("Do you wanna register?(Y/N)");
			String r=sc.nextLine();
			if(r.equals("Y"))
				userlogin();
			else
			{
				System.out.println("\t\t\t~~~~Thank You~~~ :)");
				System.exit(0);
			}
			
		}
	}
	
	static void returningPage()
	{
		System.out.println("Back to Main Page?(Yes/No)");
		String ans=sc.nextLine();	
		System.out.println("=======================================================");
		if(ans.equals("Yes"))
		{
			System.out.println("\tAdmin Page:1\tUser Page:2");
			int us=sc.nextInt();
			sc.nextLine();
			System.out.println("=======================================================");
				if(us==1)
					if(noOfadmins>0)
						adminlogin();
					else
						register();
		
				else if(us==2)
					if(noOfuser>0)
						userlogin();
					else
						register();	
			
		}
		else if(ans.equals("No"))
		{
			System.out.println("\t\t\t~~~~Thank You~~~ :)");
			System.exit(0);
		}
	}
	
}
