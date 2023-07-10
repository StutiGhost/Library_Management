package libpack;

import static libpack.Login.*;
import static libpack.User.noOfuser;
import static libpack.Author.*;
import static libpack.Librarian.*;
import java.util.Scanner;


public class AdminOperations {
static int noOfBooks;
static Book[] book=new Book[10];
//static Author author;
//static Author[] auth=new Author[10];

static Scanner sc=new Scanner(System.in);

//static int NoOfBooks;
static Book addBook()
	{
		System.out.println("=======================================================");
		System.out.println("Enter the Details:");
		System.out.println("===============");
		
		System.out.println("Enter Book Name:");
		String bname=sc.nextLine();
		
		System.out.println("===============");

		System.out.println("Enter Book Number:");
		int bno=sc.nextInt();
		sc.nextLine();
	
		System.out.println("===============");
		
		System.out.println("Enter Book Id:");
		int bid=sc.nextInt();
		sc.nextLine();
		System.out.println("===============");
		
		System.out.println("Enter Author Name:");
		String aname=sc.nextLine();
		System.out.println("===============");
		
		System.out.println("Enter Author Id:");
		int aid=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("=======================================================");
		//showBooks();
		return new Book(bname,bid,bno,true,new Author(aname,aid));

	}
static void storeDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("How many Books are added?");
	noOfBooks=sc.nextInt();
	for(int i=0;i<noOfBooks;i++)
	{
		book[i]=addBook();
		System.out.println((i+1) +" Book Details are Added Successfully!!\n");
	}
	showBooks();
	
}


static void showBooks()
{
	System.out.println("=======================================================");
	System.out.println("Book Details:\n");
	for(int i=0;i<noOfBooks;i++)
	{
		System.out.print("\nName of the Book:"+book[i].getBookName()+
				"\nId of the Book:"+book[i].getBookId()+
				"\nNumber of the Book:"+book[i].getBookNum()+
				"\nAuthor Of the Book:"+book[i].getAuthor().getAuthorName()+"\n\n");
		
	}
	System.out.println("=======================================================");
	returningPage();
}

static void authorDetails()
{
	int aid;
	for(int i=0;i<noOfBooks;i++)
	{
		 aid=book[i].getAuthor().getAuthorId();
		for(int j=0;j<noOfBooks;j++)
		{
			if(book[j].getAuthor().getAuthorId()==aid)
			{
				totalBooks+=1;
			}
			
		}
	}
	
	System.out.println("=======================================================");
	System.out.println("Author Details:\n");
	for(int i=0;i<noOfBooks;i++)
	{
		System.out.print("\nName of the Author:"+book[i].getAuthor().getAuthorName()+
				"\nId of the Author:"+book[i].getAuthor().getAuthorId()+
				"\nTotal No. of Books:"+book[i].getAuthor().getTotalBooks()+"\n\n");
		//System.out.print(auth[i].getAuthorName());
		
	}
	System.out.println("=======================================================");
	returningPage();
}
static void adminDetails()
{
	System.out.println("=======================================================");
	System.out.println("Admin Details:\n");
	
	System.out.print("\nName of the Admin:"+getAdminName()+"\nId of the Admin:"+getAdminid());	
	
	System.out.println("\n=======================================================");
	returningPage();
}
}
