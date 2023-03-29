package Ej6;

public class ExceptionTipo4 extends Throwable{
    String mensaje;

    public ExceptionTipo4(String message) {
        super(message);
        mensaje = message;
    }
}