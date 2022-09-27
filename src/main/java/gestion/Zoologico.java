package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {

    // Atributos
    private String nombre;
    private String ubicacion;
    private static ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Zoologico(){}

    // Getter & setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZona() {
        return zonas;
    }

    public void setZona(ArrayList<Zona> zonas) {
        Zoologico.zonas = zonas;
    }

    //Metodos

    public void agregarZonas(Zona zona){
        Zoologico.zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        return zonas.get(0).cantidadAnimales()+ zonas.get(1).cantidadAnimales();
    }


}
