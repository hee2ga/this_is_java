package ch05.sec08;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray=new String[3];
		strArray[0]="Java";
		strArray[1]="Java";
		strArray[2]=new String("Java");
		
		System.out.println(strArray[0]==strArray[1]); // t
		System.out.println(strArray[0]==strArray[2]); // f
		System.out.println(strArray[0].equals(strArray[2])); // t
	}
}
