package Ej2;

public class MyException extends Exception{
    String mensaje;
    public MyException(String message) {
        super(message);
        mensaje = message;
    }

    public void imprimirMensaje() {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        try{
            throw new MyException("Error personalizado");
        }
        catch (MyException me){
            me.imprimirMensaje();
        }
    }
}
