import java.util.ArrayList;
import java.util.List;

public class Section extends Element{
	public List <Element> components = new ArrayList <Element> ();
	private String title;

	public Section(String title){
		this.title = title;
	}

	public void addElement(Element table1){
		this.components.add(table1);
	}
	
	public void removeElement(Element el){
		this.components.remove(el);
	}
	
	public String toString() {
		String comps = "";

		for(Element c : components){
			comps += c.toString() + " ";
		}
		
		return String.format("%s: %s", this.title, comps);
	}

	public void add(ImageProxy imageProxy) {
		this.components.add(imageProxy);
		// TODO Auto-generated method stub
		
	}
	
	public void add(Image image) {
		this.components.add(image);
		// TODO Auto-generated method stub
		
	}
}