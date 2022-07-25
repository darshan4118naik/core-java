package com.xworkz.library.crud;

import com.xworkz.library.dto.BooksDTO;

public interface Library {
	
	public boolean readAndGrow(BooksDTO bk);
	public void getBooks();
	public boolean updateBookNameById(int id , String name);
	public boolean deleteBookByName(String name);
    public boolean deleteBookByAuthor(String author);
    

}
