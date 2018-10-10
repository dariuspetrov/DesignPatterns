import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book mybook = new Book("Disco Titanic");
		Author gheo = new Author("Radu Pavel Gheo");
		
		ArrayList autori = new ArrayList<Author>();
		autori.add(gheo);
		
		mybook.addAuthor(autori);
		mybook.addChapter("Capitolul 1");
		mybook.addSubChapter(0, "Subcapitolul 1");
		mybook.addText(0, 0 , "Hello World!");
		mybook.addSubChapter(0, "Subcapitolul 2");
		mybook.addImage(0, 0 , "Image1");
		mybook.addTable(0, 0 , "Table1");
		mybook.addText(0, 1 , "Foo bar");
		
		System.out.println(mybook);
	}
}