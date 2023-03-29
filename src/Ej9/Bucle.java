package Ej9;

import java.util.Scanner;

public class Bucle {
Scanner sc = new Scanner(System.in);
    public Bucle() {
    }

    public void sumar(){

        System.out.println("Escriba el primer numero: ");
        int num1 = pedirNumero();

        System.out.println("Escriba el segundo numero: ");
        int num2 = pedirNumero();

        System.out.println("Resultado = " + (num1 + num2));
    }

    public int pedirNumero(){
        int num = 0;
        try{
            num = Integer.parseInt(sc.next());
        }
        catch (NumberFormatException e){
            System.out.println("Numero incorrecto, inténtelo otra vez: ");
            num = pedirNumero();
        }
        return num;
    }

    public static void main(String[] args){
        Bucle bucle = new Bucle();
        bucle.sumar();
    }
}
