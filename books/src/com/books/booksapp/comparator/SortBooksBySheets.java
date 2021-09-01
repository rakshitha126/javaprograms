package com.books.booksapp.comparator;

	import java.util.Comparator;
	import com.books.booksapp.dto.BooksDTO;
	public class SortBooksBySheets implements Comparator<BooksDTO>{
		@Override
		public int compare(BooksDTO o1,BooksDTO o2)
		{
			return o1.getSheets().compareTo(o2.getSheets());
		}

	}

