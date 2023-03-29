package Ej1;

public class Exception1 extends Exception{


    public static void main(String[] args){
        try{
            throw new Exception("Mi primera excepcion");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Se ejecuta siempre esta linea");
        }
    }
}
