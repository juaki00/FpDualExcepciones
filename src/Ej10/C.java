package Ej10;

public class C extends B{

    public C() {
    }

    @Override
    public void lanzarExcepcion() throws Exception {
        throw new Exception("Excepcion lanzada por C");
    }
}
