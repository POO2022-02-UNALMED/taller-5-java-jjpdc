package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    // Atributos
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public static int peces;


    // Constructores

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
        peces++;
    }

    public Pez(){
        listado.add(this);
        peces++;
    }

    // Getter & Setter


    public ArrayList<Pez> getListado() {
        return listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }


    // Metodos

    public static int cantidadPeces(){
        return peces;

    }

    public String movimiento(){

        return "nadar";
    }

    public static Pez crearSalmon(String nombre, int edad, String genero){
        Pez.salmones++;
        return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
    }

    public static Pez crearBacalao(String nombre, int edad, String genero){
        Pez.bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, "gris", 6);
    }

}