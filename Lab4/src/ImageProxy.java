
public class ImageProxy extends Element{

	
	private String imageName;
	private Image img = null;

	public ImageProxy(String imageName) {
	
		this.imageName = imageName;
	}
	
	@Override
	public void addElement(Element el) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(Element el) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(this.img == null) {
			img = new Image(this.imageName);
		}
		
		return this.img.toString();
	}

}
