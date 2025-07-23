package ch13.sec02.exam01;

public class Product<K,M> {
	private K kid;
	private M model;
	
	public K getKid() {
		return kid;
	}
	public M getModel() {
		return model;
	}
	public void setKid(K kid) {
		this.kid = kid;
	}
	public void setModel(M model) {
		this.model = model;
	}
}
