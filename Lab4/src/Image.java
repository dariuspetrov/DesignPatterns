import java.util.concurrent.TimeUnit;

public class Image extends Element{
	private String name;
	
	public Image(String name){
		this.name = name;
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
