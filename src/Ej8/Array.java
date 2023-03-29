package Ej8;

public class Array {

    public int[] enteros;

    public Array(int... ent) {

        enteros = new int[ent.length];
        int indice =0;

        for(int numero: ent){
            enteros[indice] = numero;
            indice++;
        }
    }

    public void mostrarArray(){
        for (int i = 0; i < enteros.length; i++) {
            System.out.println(enteros[i]);
        }
    }

    public static void main(String[] args) {
        Array array = new Array(1,2,3,4,3,2,1);
        array.mostrarArray();

        try{ //enteros.length = 7
            array.enteros[7] = 2;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
