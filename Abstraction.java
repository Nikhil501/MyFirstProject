package OopsConcept;
abstract class QQQ{
	
	  abstract void m1();
	
}	
public class Abstraction extends QQQ {
	
	public void m1() {
		System.out.println("Abstract method achivd using Abstract method");
		
	}
	public static void main(String[] args) {
		Abstraction a = new Abstraction();
		a.m1();
	
	}

}
