package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    // Atributos
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;

    public static int aves;

    public static int aguilas;
    private String colorPlumas;

    // Constructores
    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
        aves++;
    }

    public Ave(){
        listado.add(this);
        aves++;
    }

    //Getter & Setter


    public ArrayList<Ave> getListado() {
        return listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }


    // Metodos

    public static int cantidadAves(){
        return aves;
    }

    public String movimiento(){

        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        Ave.halcones++;
        return new Ave(nombre, edad, "montanas", genero, "cafe glorioso");

    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        Ave.aguilas++;
        return new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
    }



}