package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    // Atributos
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    public static int reptiles;


    // Constructores

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
        reptiles++;
    }

    public Reptil(){
        listado.add(this);
        reptiles++;
    }

    // Getter & Setter

    public ArrayList<Reptil> getListado() {
        return listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }


    // Metodos

    public static int cantidadReptiles(){
        return reptiles;

    }

    public String movimiento(){

        return "reptar";
    }

    public static Reptil crearIguana(String nombre, int edad, String genero){
        Reptil.iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, "verde", 3);

    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero){
        Reptil.serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
    }

}