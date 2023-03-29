package Ej4;

import javax.sound.midi.Soundbank;

public class Persona {

    String nombre;

    public Persona(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {

        Persona persona = null;
//        persona.getNombre();

        try{
            persona.getNombre();
        }
        catch (NullPointerException npe){
            System.out.println("Objeto no instanciado");
        }
    }
}
