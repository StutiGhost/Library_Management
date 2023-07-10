package libpack;

import java.util.Scanner;

import static libpack.UserAdminOperations.*;  
import static libpack.Login.*;

public class MainPage {
	

	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\t\t\t~~Library Management~~");
		
		System.out.println("Register:");
					register();
		
		//System.out.println("=======================================================");
		
		returningPage();
		sc.close();
	}

}