package Ej6;

public class ExceptionTipo3 extends Throwable{
    String mensaje;

    public ExceptionTipo3(String message) {
        super(message);
        mensaje = message;
    }
}