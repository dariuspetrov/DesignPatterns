import java.util.ArrayList;
import java.util.List;

public abstract class Element {
	public abstract void addElement(Element el) throws Exception;
	public abstract void removeElement(Element el);
	public abstract String toString();
}