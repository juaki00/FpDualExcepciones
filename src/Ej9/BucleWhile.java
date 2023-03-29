package Ej9;

import java.io.LineNumberReader;
import java.util.Scanner;

public class BucleWhile {
    Scanner sc = new Scanner(System.in);

    public BucleWhile() {
    }

    public void sumar() {
        int num1 = 0;
        int num2 = 0;

        System.out.println("Escriba el primer numero: ");
        num1 = pedirNumero();

        System.out.println("Escriba el segundo numero: ");
        num2 = pedirNumero();

        System.out.println("Resultado = " + (num1 + num2));
    }

    public int pedirNumero() throws NumberFormatException {
        boolean esCorrecto = false;
        int num = 0;
        while (!esCorrecto) {
            try {
                num = Integer.parseInt(sc.next());
                esCorrecto = true;
            } catch (NumberFormatException e) {
                System.out.println("Formato de numero incorrecto, intentelo otra vez: ");
            }
        }
        return num;
    }

    public static void main(String[] args) {
        BucleWhile bucle = new BucleWhile();
        bucle.sumar();
    }
}
