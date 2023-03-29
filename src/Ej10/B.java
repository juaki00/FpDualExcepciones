package Ej10;

public class B extends A{

    public B() {
    }

    @Override
    public void lanzarExcepcion() throws Exception {
        throw new Exception("Excepcion lanzada por B");
    }
}
