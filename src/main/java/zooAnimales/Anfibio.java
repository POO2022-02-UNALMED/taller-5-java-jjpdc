package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    // Atributos
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    public static int anfibios;


    // Constructores

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
        anfibios++;
    }

    public Anfibio() {
        listado.add(this);
        anfibios++;
    }

    // Getter & Setter

    public ArrayList<Anfibio> getListado() {
        return listado;
    }

    public String getColorPiel() {
        return this.colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    // Metodos

    public static int cantidadAnfibios(){
        return anfibios;
    }

    public  String movimiento(){

        return "saltar";
    }

    public static Anfibio crearRana(String nombre, int edad, String genero){
        Anfibio.ranas++;
        return new Anfibio(nombre, edad, "selva", genero, "rojo", true);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero){
        Anfibio.salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
    }


}