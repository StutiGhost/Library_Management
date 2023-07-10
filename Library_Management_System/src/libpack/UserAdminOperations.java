package libpack;

import static libpack.User.*;
import static libpack.UserAdminOperations.register;
import static libpack.Librarian.*;
import static libpack.Login.*;

import java.util.Scanner;

public class UserAdminOperations 
{
	@SuppressWarnings("resource")
	static Scanner sc=new Scanner(System.in);

	static void register()
	{
			System.out.println("Register as 'User' or 'Admin' ");
			String loginfo=sc.nextLine();
			
			System.out.println(loginfo);
			if(loginfo.equals("Admin"))
				adminRegister();
			else if(loginfo.equals("User"))
				userRegister();
			else
			{	
				System.out.println("Choose Properly!");
				register();
			}
					
	}
	
	static Librarian adminRegister()
	{
		System.out.println("=======================================================");
		System.out.println("Enter the Admin Details:");
		System.out.println("===============");
		
		System.out.println("Enter Admin Name:");
		String aname=sc.nextLine();
		
		System.out.println("===============");
		
		System.out.println("Enter Admin Id:");
		int aid=sc.nextInt();
		sc.nextLine();		
		System.out.println("=======================================================");
		//showBooks();
		return new Librarian(aid,aname);

	}
	
	static User userRegister()
	{
		System.out.println("=======================================================");
		System.out.println("Enter the Details:");
		System.out.println("===============");
		
		System.out.println("Enter User Name:");
		String uname=sc.nextLine();
	
		System.out.println("===============");
		System.out.println("Enter User Id:");
		int uid=sc.nextInt();
		sc.nextLine();
		System.out.println("===============");
		
		System.out.println("=======================================================");
		//showBooks();
		return new User(uid,uname);
	}
}
