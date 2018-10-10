import java.util.List;
import java.util.ArrayList;


public class SubChapter {
	public String title;
	public List <Element> elements = new ArrayList <Element>();

	public SubChapter(int index, String title){
		this.title = title;
	}

	public int createText(String textstring){
		Text newtext = new Text(textstring);
		this.elements.add(newtext);
		
		return this.elements.indexOf(newtext);
	}

	public int createImage(String imagename){
		Image newimage = new Image(imagename);
		this.elements.add(newimage);
		
		return this.elements.indexOf(newimage);
	}

	public int createTable(String tablename){
		Table newtable = new Table(tablename);
		this.elements.add(newtable);
		
		return this.elements.indexOf(newtable);
	}

}