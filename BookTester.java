class BookTester{
public static void main(String a[])
{
Book book=new Book("never told her",250,20,9);
book.printBookDetails();
Book bk=new Book("Her last wish",352,45,4);
bk.printBookDetails();
book.fetchBook();
book.readbook();
}
}