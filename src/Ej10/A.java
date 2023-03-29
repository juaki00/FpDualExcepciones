package Ej10;

public class A {

    public A() {
    }

    public void lanzarExcepcion() throws Exception {
        throw new Exception("Excepcion lanzada por A");
    }

    public static void main(String[] args) throws Exception {
        C tipoC = new C();

        ((A)tipoC).lanzarExcepcion();

    }
}
