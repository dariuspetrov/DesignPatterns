
public class Table extends Element {
	private String name;
	
	public Table(String name){
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
