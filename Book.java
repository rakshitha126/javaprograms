

class Book
{
String bookname;
int sheets;
int pageno;
int date;
public Book(String bn,int shee,int pn,int dt)
{
System.out.println("book received");
bookname=bn;
sheets=shee;
pageno=pn;
date=dt;
}
public void fetchBook()
{
System.out.println(" ");
}
public void printBookDetails()
{
System.out.println(bookname+" "+sheets+" "+pageno+" "+date);
}
public void readbook()
{
System.out.println("reading something");
}
}