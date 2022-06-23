public class BookMovieTester {

static String movies[]	= {"Om","Upendra","Gaalipata","Paramatma","A","Mungarumale"};
static String  snackName[] ={"Popcorn","samosa","Gobi","FF"};
public static void main(String a[])
{
	
BookMyMovie bookMyShow = new BookMyMovie(movies,snackName,600);
bookMyShow.showTime(2,"Upendra","Darshan");
bookMyShow.snacks(2,"samosa","Darshan");
}
	
	
}