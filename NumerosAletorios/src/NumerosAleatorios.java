import java.util.Random;

/*
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 10) armazene-os em um vetor. Ao final mostre os números e seus respectivos sucessores.
*/


public class NumerosAleatorios {
    public static void main(String[] args){
        Random random = new Random();

        int [] numerosAleatorios = new int [20];

        for (int i = 0; i< numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("\nSucessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("\nAntecessores dos Numeros Aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero - 1) + " ");
        }
    }
}
