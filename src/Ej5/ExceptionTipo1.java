package Ej5;

public class ExceptionTipo1 extends Throwable{
    String mensaje;

    public ExceptionTipo1(String message) {
        super(message);
        mensaje = message;
    }
}
