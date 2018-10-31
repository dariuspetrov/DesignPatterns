
public class Table extends Element {
	private String name;
	
	public Table(String name){
		this.name = name;
	}

	public String toString() {
		return this.name;
	}

	public void addElement(Element el) throws Exception {
		throw new Exception("Not supported");
		
	}

	public void removeElement(Element el) {
		// TODO Auto-generated method stub
		
	}
}
