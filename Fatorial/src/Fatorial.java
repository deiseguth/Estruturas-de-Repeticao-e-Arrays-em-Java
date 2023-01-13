import java.util.Scanner;

/*
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
 * Ex: 5! = 120
 */

public class Fatorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.println(fatorial + "! = ");
        for (int i = fatorial; i>=1; i --){
            multiplicacao = multiplicacao * i;
        }

        System.out.println(multiplicacao);
        scan.close();
    }
}
//while é usado para laços infinitos
//Quando é necessário um contador (variavel dependente) é usado o for
//Do while é usado quando é preciso rodar o programa antes de verificar se é verdadeiro ou falso