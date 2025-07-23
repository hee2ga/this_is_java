package verify.Exam02;

public class Container<T> {
	private T content;
	
	public void set(T content) {
		this.content = content;
	}
	
	public T get() {
		return content;
	}
}
