import java.util.ArrayList;
import java.util.List;


public class Book {
	private String title;
	private List <Author> authors;
	private TableOfContents toc;
	private List <Chapter> chapters = new ArrayList <Chapter>();
	
	public Book(String title){
		this.title = title;
	}
	
	public String toString(){
		String authorstring = "";
		String chapterstring = "";
		String elem = "";

		for(Author author : this.authors){
			authorstring += author.name + " ";
		}

		for(Chapter chapter : this.chapters){
			chapterstring += chapter.title;
			for(SubChapter subchapter : chapter.subchapters){
				chapterstring += ", " + subchapter.title + ": ";
				for(Element e : subchapter.elements){
					elem += " " + e.toString();
				}
				chapterstring += elem;
			}
		}

		return "Title: " + this.title + " \nAuthor(s): " + authorstring + "\n" + chapterstring;
	}
	
	public int addChapter(String chaptername){
		Chapter newchapter = new Chapter(chaptername);
		this.chapters.add(newchapter);
		
		return this.chapters.indexOf(newchapter);
	}
	
	public void addSubChapter(int index, String chaptername){
		Chapter ch = this.chapters.get(index);
		ch.createSubChapter(index, chaptername);
	}
	
	public void addText(int chapterindex, int subchapterindex, String text){
		this.chapters.get(chapterindex).subchapters.get(subchapterindex).createText(text);
	}

	public void addImage(int chapterindex, int subchapterindex, String imagename){
		this.chapters.get(chapterindex).subchapters.get(subchapterindex).createImage(imagename);
	}

	public void addTable(int chapterindex, int subchapterindex, String tablename){
		this.chapters.get(chapterindex).subchapters.get(subchapterindex).createTable(tablename);
	}

	
	public void addAuthor(ArrayList <Author> authors){
		this.authors = authors;
	}

	public void setToc(TableOfContents tableofcontents){
		this.toc = tableofcontents;
	}
}