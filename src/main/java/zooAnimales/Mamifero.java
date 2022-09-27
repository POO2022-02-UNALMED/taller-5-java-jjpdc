package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal {
    // Atributos
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();

    public static int mamiferos;

    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    // Constructores

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
        mamiferos++;
    }

    public Mamifero(){
        listado.add(this);
        mamiferos++;
    }

    // Getter & Setter


    public ArrayList<Mamifero> getListado() {
        return listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }


    // Metodos

    public static int cantidadMamiferos(){
        return mamiferos;
    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero){
        Mamifero.caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, true, 4);

    }

    public static Mamifero crearLeon(String nombre, int edad, String genero){
        Mamifero.leones++;
        return new Mamifero(nombre, edad, "selva", genero, true, 4);
    }


}