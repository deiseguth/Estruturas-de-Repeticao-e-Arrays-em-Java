import java.util.Scanner;
/*
 * Faça um progrma que peça N números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares.
 */

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int  numero;
        int quantidadePares = 0, quantidadeImpares = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 ==0) quantidadePares++;
            else quantidadeImpares++;

            count++;

        } while (count < quantidadeNumeros);
        System.out.println("Quantidade Pares: " + quantidadePares);
        System.out.println("Quantidade Impares: " + quantidadeImpares);
        scan.close();
        
    }
}
