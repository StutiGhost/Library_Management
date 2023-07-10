package libpack;

import static libpack.UserOperations.*;

import static libpack.AdminOperations.*;
import java.util.Scanner;
import static libpack.Login.*;

public class User
{
	static int userid;
	static int ubookno=0;
	static String userName;
	static int noOfuser=0;
	
	public static int getUserid() {
		return userid;
	}

	public static void setUserid(int userid) {
		User.userid = userid;
	}

	public static String getUserName() {
		return userName;
	}

	public static void setUserName(String userName) {
		User.userName = userName;
	}

	
	public User(int userid,String userName)
	{
		this.userid=userid;
		this.userName=userName;
		this.noOfuser+=1;
		returningPage();
	}

	static Scanner sc=new Scanner(System.in);
	
	static void userPage()
	{	System.out.println("=======================================================");
		System.out.println("User Page:");
		System.out.println("\n Press 1: To Search Books"+
				"\n Press 2: To show the issued Books"+
				"\n Press 3: To return the Book"+
				"\n Press 4: To show the profile");
		System.out.println("=======================================================");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			searchBook();
			
			break;
		case 2:
			issuedBook();
			break;
		case 3:
			bookReturn();
		case 4:
			showUser();
		}
	}
}
