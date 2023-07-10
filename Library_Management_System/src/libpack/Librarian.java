package libpack;

import static libpack.AdminOperations.*;
import java.util.Scanner;
import static libpack.Login.*;

public class Librarian 
{
	static int adminid;
	static String adminName;
	static int noOfadmins=0;
	
	public static int getAdminid() {
		return adminid;
	}


	public static void setAdminid(int adminid) {
		Librarian.adminid = adminid;
	}


	public static String getAdminName() {
		return adminName;
	}


	public static void setAdminName(String adminName) {
		Librarian.adminName = adminName;
	}


	public Librarian(int adminid,String adminName)
	{
		this.adminid=adminid;
		this.adminName=adminName;
		this.noOfadmins+=1;
		returningPage();
	}
	static Scanner sc=new Scanner(System.in);
	
	
	static void adminPage()
	{
		System.out.println("=======================================================");
		System.out.println("Admin Page:");
		System.out.println("\n Press 1: To add Books"+
				"\n Press 2: To show the Book Details"+
				"\n Press 3: To Show the Author Details"+
				"\n Press 4: To show the User Details");
		System.out.println("=======================================================");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			storeDetails();
			break;
		case 2:
			showBooks();
			break;
		case 3:
			authorDetails();
			break;
		case 4:
			adminDetails();
			break;
		}
	}
}

