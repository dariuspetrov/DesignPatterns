
public class Image extends Element{
	private String name;
	
	public Image(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
