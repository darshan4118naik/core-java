interface LibraryInt
{
	public boolean readAndGrow(BookDTO bk);
	public void getBooks();
	public boolean updateBookNameById(int id , String name);
	public boolean deleteBookByName(String name);
	public boolean deleteBookByAuthor(String author);
}
