package Ej5;

public class ExceptionTipo2 extends Throwable{
    String mensaje;

    public ExceptionTipo2(String message) {
        super(message);
        mensaje = message;
    }
}
