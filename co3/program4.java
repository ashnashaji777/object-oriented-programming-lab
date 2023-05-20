package co3;
import java.util.*;
class Publisher{
	String pubname;
	int year;
	public Publisher(String pubname,int year) {
		this.pubname=pubname;
		this.year=year;
	}
}
class Book extends Publisher{
	String title;
	String author;
	public Book(String pubname,int year,String title,String author) {
		super(pubname,year);
		this.title=title;
		this.author=author;
		
	}
	
}
class Literature extends Book{
	String lang;
	public Literature(String pubname,int year,String title,String author,String lang) {
		super(pubname,year,title,author);
		this.lang=lang;
	}
	public void ldisplay() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the publisher name");
		String pubname=sc.next();
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the title");
		String title=sc.next();
		System.out.println("enter the author");
		String author=sc.next();
		System.out.println("enter the language");
		String lang=sc.next();
		System.out.println("------------------------------------");
		System.out.println( "Publisher name   " + pubname  + "\nyear   " + year + "\ntitle  " + title + "\nauthor   " + author +"\nLANGUAGE   " + lang);

        System.out.println( "...........................................................");
		
	}
}
class Fiction extends Book{
	int chapters;
	public Fiction(String pubname,int year,String title,String author,int chapters) {
		super(pubname,year,title,author);
		this.chapters=chapters;
	}
	public void fdisplay() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the publisher name");
		String pubname=sc.next();
		System.out.println("enter the year");
		int year=sc.nextInt();
		System.out.println("enter the title");
		String title=sc.next();
		System.out.println("enter the author");
		String author=sc.next();
		System.out.println("enter the chapters");
		int chapters=sc.nextInt();
		System.out.println("------------------------------------");
		System.out.println( "Publisher name   " + pubname  + "\nyear   " + year + "\ntitle  " + title + "\nauthor   " + author +"\nchapters   " + chapters);

        System.out.println( "...........................................................");
	}
}
	


public class program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);



		int c;

		do

		{

		    System.out.println("1:literature   2: fiction");

		    c=sc.nextInt();

		    switch(c)

		    {

		        case 1: 

		        Literature lit = new Literature ("" ,0,  "",  "",  "");

		        lit.ldisplay();

		        break;



		        case 2: 

		        Fiction fic = new Fiction ( "", 0,  "",  "", 0);

		        fic.fdisplay();

		        break;

		        

		        default : System.out.println("not valid");



		    }

		}

		while(c!=0);

		}


		
	}


