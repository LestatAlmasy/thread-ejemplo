package example_two_threads;

import java.util.Random;

public class Corredor extends Thread {
    private String nombre;
    private int distancia;
    private boolean meta;
    private int total_distancia;
    
    public Corredor(String nombre) {
        this.nombre = nombre;
        this.distancia = 0;
        this.meta = false;
        this.total_distancia=4000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void correr(){
        this.distancia = this.distancia + this.azar();
    }
    
    public int azar(){
        Random random = new Random();
        return random.nextInt(500 + 1 - 100) + 100;
    }
    
    @Override
    public void run(){
        while(!meta){
            
            if(distancia < total_distancia){
                correr();
                System.out.println(this.nombre+" va en el "+this.distancia+" mts.");
            }else{
                System.out.println(this.nombre+" ha llegado a la meta!");
                this.meta = true;
            }
        }
    }
}
