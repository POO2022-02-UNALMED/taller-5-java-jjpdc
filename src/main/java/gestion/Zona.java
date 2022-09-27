package gestion;

import zooAnimales.Animal;

import java.util.ArrayList;

public class Zona {

    // Atributos
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<Animal>();


    // Constructores

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){}

    // Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zoologico getZoo() {
        return zoo;
    }

    public void setZoo(Zoologico zoo) {
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }
    //Metodos

    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }

}
