package app;

class MyClass{
	int x;
	MyClass(){ // Construtor sem parâmetros
		x = 10;
	}
}

public class ConsDemo {

	public static void main(String[] args) {
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		
		System.out.println(t1.x + " " + t2.x);
	}

}
