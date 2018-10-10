import java.util.ArrayList;
import java.util.List;


public class Chapter {
	public String title;
	public List <SubChapter> subchapters = new ArrayList <SubChapter>();
	
	public Chapter(String title){
		this.title = title;
	}
	
	public void createSubChapter(int index, String chaptername){
		SubChapter newsubchapter = new SubChapter(index, chaptername);

		this.subchapters.add(newsubchapter);
	} 	
}