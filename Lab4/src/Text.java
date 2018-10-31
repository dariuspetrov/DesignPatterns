
public class Text extends Element{
	private String text;
	AlignStrategy strategy;
	
	public Text(String text){
		this.text = text;
	}

	@Override
	public String toString() {
		if(strategy == null)
			return this.text;
		else
			return this.strategy.print(text);
	}

	@Override
	public void addElement(Element el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(Element el) {
		// TODO Auto-generated method stub
		
	}
	
	public void setAlignStrategy(AlignStrategy strategy) {
			this.strategy = strategy;		
	}

	
}
