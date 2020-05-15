import java.util.*;
import java.util.ArrayList;
class Library {

int NumberOfBooks;

    ArrayList<Book>Books=new ArrayList<Book>();
	ArrayList<User>Users=new ArrayList<User>();
	
		
		class Book
		{
		   String Title;
		   String Author;
		   String Date;
		   int NumberOfAvaialblesCopies;
		   Book(String T,String A,String D,int N){
			   this.Title=T;
			   this.Author=A;
			   this.Date=D;
			   this.NumberOfAvaialblesCopies=N;
			   
		   }
		}
		
		class User
		{
			String Name;
			int ID;
			String PreviousBooks;
			
			User(String N, int id, String P){
				this.Name=N;
				this.ID=id;
				this.PreviousBooks=P;
				
			}
		}
		
		class Admin{
		 	String Name="Admin";
		 	 Scanner S = new Scanner (System.in);
		 	  void InsertBook() {
		 		 
		 		 
		 	    String T = S.nextLine();
		 		String A = S.nextLine();
		 		String D = S.nextLine();
		 		int N= S.nextInt();
		 		
		 		
		 		boolean Flag=false ;
			 		for(int i=0;i<NumberOfBooks;i++)
			 		{
			 			
			 			Book temp=Books.get(i);
			 			if (temp.Title==T)
			 				{temp.NumberOfAvaialblesCopies+=1;
			 				 Books.set(i,temp);
			 				 Flag=true;}}
			 			if(Flag==false)
			 			{Book book=new Book(T,A,D, N);
		 		 
			 			Books.add(book);
			 			System.out.println("book is added");
			 			NumberOfBooks+=1;}

		 	  															}
		 	  
		 	  void SearchForBooks() {
		
		 		 String title=S.nextLine();
		 		boolean Flag=false ;
		 		for(int i=0;i<NumberOfBooks;i++)
		 		{
		 			
		 			Book temp=Books.get(i);
		 			if (temp.Title==title)
		 				{System.out.println("Number of available copies" + temp.NumberOfAvaialblesCopies );
		 				
		 				 Flag=true;}}
		 			if(Flag==false)
		 				
		 				System.out.println(" Book Not Found");
		 			
		 					
		 			
		 			
		 		}
		 		 
		 		 
		 		 
		 		 
		 	  }
		 	  
		 	  }
		 	
		 	
		
		
		
}
	    
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
	
		
		
		
		
		
	