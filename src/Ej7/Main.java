package Ej7;

public class Main {

    public Main() {
    }

    public void lanza3Excepciones() throws Excepcion1, Excepcion2, Excepcion3 {
        try {
            throw new Excepcion1();
        }
        catch (Excepcion1 e1){
            try{
                throw new Excepcion2();
            }
            catch (Excepcion2 e2){
                throw new Excepcion3();
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        try{
            main.lanza3Excepciones();
        }
        catch (Excepcion1 | Excepcion2 | Excepcion3 e){
            System.out.println("Controladas 3 excepciones a la vez ");
        }
    }
}
