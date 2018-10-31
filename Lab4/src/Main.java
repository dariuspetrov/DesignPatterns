import java.util.ArrayList;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Book mybook = new Book("Disco Titanic");
		Author gheo = new Author("Radu Pavel Gheo");
		
		ArrayList authors = new ArrayList<Author>();
		authors.add(gheo);
		
		mybook.addAuthor(authors);
		Section section1 = new Section("Chapter 1");
		//section1.add(new ImageProxy("My dream BMW"));
		//section1.add(new ImageProxy("another BMW"));
		Section section2 = new Section("Chapter 2");
		Section subsection1 = new Section("Subchapter 1.1");
		Section subsubsection1 = new Section("SubSubchapter 1.1.1");
		Section subsubsection2 = new Section("SubSubchapter 1.1.2");

		Image image1 = new Image("image1");
		Text text1 = new Text("text1");
		Text text2 = new Text("text2");
		text2.setAlignStrategy(new AlignCenter());
		Text prefaceText = new Text("prefaceText");
		Table table1 = new Table("table1");

		section1.addElement(image1);
		section1.addElement(prefaceText);
		section1.addElement(table1);
		section1.addElement(subsection1);
		subsection1.addElement(subsubsection1);
		subsection1.addElement(text1);
		subsection1.addElement(subsubsection2);
		subsection1.addElement(text2);
		
		mybook.addElement(section1);
		mybook.addElement(section2);
		System.out.println(mybook);
		
		
		Book otherBook = new Book("Something Interesting");
		Author ion = new Author("Ion Ionescu Americanu");
		
		ArrayList authors1 = new ArrayList<Author>();
		authors1.add(ion);
		authors1.add(gheo);
		
		
		otherBook.addAuthor(authors1);
		Section section11 = new Section("Chapter 1");
		//section11.add(new ImageProxy("Something Bugatti"));
		//section11.add(new ImageProxy("Boeing 747"));
		Section section21 = new Section("Chapter 2");
		Section subsection11 = new Section("Subchapter 1.1");
		Section subsubsection11 = new Section("SubSubchapter 1.1.1");
		Section subsubsection21 = new Section("SubSubchapter 1.1.2");


		section11.addElement(image1);
		section11.addElement(prefaceText);
		section11.addElement(table1);
		section11.addElement(subsection1);
		subsection11.addElement(subsubsection1);
		subsection11.addElement(text1);
		subsection11.addElement(subsubsection2);
		subsection11.addElement(text2);
		
		otherBook.addElement(section11);
		otherBook.addElement(section21);
		System.out.println(otherBook);
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}