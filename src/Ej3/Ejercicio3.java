package Ej3;

import Ej2.MyException;

public class Ejercicio3 {

    public Ejercicio3() {
    }

    public void lanzarExcepcion() throws MyException {
        throw new MyException("Excepcion lanzada");
    }

    public static void main(String[] args) {

        try{
            Ejercicio3 e3 = new Ejercicio3();
            e3.lanzarExcepcion();
        }
        catch (Exception me){
            System.out.println(me.getMessage());
        }
    }
}
