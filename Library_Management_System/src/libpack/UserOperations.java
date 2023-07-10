package libpack;
import static libpack.User.*;
import static libpack.Login.*;
import static libpack.AdminOperations.*;

import java.util.Scanner;

public class UserOperations {
	//static Book[] book;
	static Scanner sc=new Scanner(System.in);
	static int uid,bid;
	static User[] user=new User[10];
	static int issuedbookid;
	
	static void searchBook()
	{
		int f=1;
		System.out.println("Enter the Book Id");
		bid=sc.nextInt();
		for(int i=0;i<noOfBooks;i++)
		{
			if(book[i].getBookId()==bid)
			{
				System.out.print(book[i].getBookName()+" \n");
				f=0;
				break;
			}
			else
				f=1;
		}	
			
		if(f==1)
				System.out.print("Not Found!!");
		else
		{
			System.out.print("Do you wanna issue this book?(Y/N)");
			char ibook=sc.next().charAt(0);
			
			if(ibook=='Y')
			{
				issuedbookid=bid;
				ubookno+=1;	
			}
			
		}
		returningPage();
	}
	
	
	static void issuedBook()
	{
		System.out.println("=======================================================");
		System.out.println("Issued Book Details:\n");
		for(int i=0;i<noOfBooks && ubookno>0;i++)
		{
			if(book[i].getBookId()==issuedbookid)
			{
				System.out.print("\nName of the Book:"+book[i].getBookName()+
						"\nId of the Book:"+book[i].getBookId()+
						"\nAuthor Of the Book:"+book[i].getAuthor().getAuthorName()+"\n\n");	
			}
		}
		if(ubookno==0)
			System.out.println("No Book Issued!!");
		System.out.println("=======================================================");
		returningPage();
	}
	
	static void bookReturn()
	{
		sc.nextLine();
		System.out.print("Do you wanna return this book?(Y/N)");
		String ibook=sc.nextLine();
		if(ibook.equals("Y"))
		{
			
			System.out.print("Enter issued book Id");
			int ubookid=sc.nextInt();
			sc.nextLine();
			if(ubookid==issuedbookid && ubookno>0)
			{
				ubookno-=1;
			}
		}	
		System.out.println("\nReturn the book succesfully!\n");
		System.out.println("=======================================================");
		returningPage();
	}
	static void showUser()
	{
		System.out.println("=======================================================");
		System.out.println("User Details:\n");
		System.out.println("===============");
		System.out.print("\nName of the User:"+getUserName()+
					"\nId of the User:"+getUserid()+
					"\nNumber of issued book:"+ubookno+"\n\n");
		System.out.println("=======================================================");
		returningPage();
	}
}
