package Ej5;

public class Ejercicio5 {

    public void f() throws ExceptionTipo1, ExceptionTipo2 {
        try {
            g();
        } catch (ExceptionTipo1 et1) {
            throw new ExceptionTipo2("Error excepcion tipo 2");
        }
    }

    public void g() throws ExceptionTipo1 {
        throw new ExceptionTipo1("Error excepcion tipo 1");
    }

    public static void main(String[] args) {
        Ejercicio5 e5 = new Ejercicio5();

        try {
            e5.f();
        } catch (ExceptionTipo1 e) {
            System.out.println("ExcepcionTipo1");
        } catch (ExceptionTipo2 e) {
            System.out.println("ExcepcionTipo2");
        }

    }
}
