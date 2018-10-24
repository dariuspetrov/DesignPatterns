
public class Image extends Element{
	private String name;
	
	public Image(String name){
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	@Override
	public void addElement(Element el) throws Exception {
		throw new Exception("Not supported");
		
	}


	@Override
	public void removeElement(Element el) {
		// TODO Auto-generated method stub
		
	}
}
