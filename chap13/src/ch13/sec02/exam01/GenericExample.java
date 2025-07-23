package ch13.sec02.exam01;

public class GenericExample {
	public static void main(String[] args) {
		Product<Tv, String>product1=new Product<>();
		product1.setKid(new Tv());
		product1.setModel("스마트 TV");
		
		Tv tv=product1.getKid();
		String tvModel=product1.getModel();
		
		Product<Car, String> product2=new Product<Car, String>();
		
		product2.setKid(new Car());
		product2.setModel("SUV자동차");
		
		Car car=product2.getKid();
		String carModel=product2.getModel();
	}
}
