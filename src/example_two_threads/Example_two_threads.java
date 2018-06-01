package example_two_threads;

public class Example_two_threads {

    public static void main(String[] args)throws InterruptedException {
        Corredor corredorUno = new Corredor ("Lestat");
	Corredor corredorDos = new Corredor ("Cata");
        
	corredorUno.start();
        corredorDos.start();
    }    
}
