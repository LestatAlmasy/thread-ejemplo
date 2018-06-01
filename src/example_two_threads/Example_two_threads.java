package example_two_threads;

public class Example_two_threads {

    public static void main(String[] args)throws InterruptedException {
        Thread corredorUno = new Thread(new Corredor ("Lestat"));
	Thread corredorDos = new Thread(new Corredor ("Cata"));
	corredorUno.start();
        corredorDos.start();
    }

    
}
