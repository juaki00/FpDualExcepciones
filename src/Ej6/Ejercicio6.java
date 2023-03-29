package Ej6;


public class Ejercicio6 {

    public void f() throws ExceptionTipo3, ExceptionTipo4 {
        try {
            g();
        } catch (RuntimeException rte) {
            throw new ExceptionTipo4("Error excepcion tipo 2");
        }
    }

    public void g() throws ExceptionTipo3 {
        throw new ExceptionTipo3("Error excepcion tipo 1");
    }

    public static void main(String[] args) {
        Ejercicio6 e6 = new Ejercicio6();

        try {
            e6.f();
        } catch (ExceptionTipo3 e) {
            System.out.println("ExcepcionTipo3");
        } catch (ExceptionTipo4 e) {
            System.out.println("ExcepcionTipo4");
        }
    }
}
