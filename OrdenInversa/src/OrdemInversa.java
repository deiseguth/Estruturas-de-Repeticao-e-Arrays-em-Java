/*
 * Crie um vetor de 6 números inteirose mostre-os na ordem inversa.
 */

 //Array
public class OrdemInversa {
    public static void main(String[] args) {
        int [] vetor = {-5, -6, 15, 58, 8, 4};

        //System.out.println(vetor.length-1); 

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.println(vetor[count] + " ");
            count ++;
        }

        System.out.println("\nVetor ao contrário: ");
        for (int i = (vetor.length -1); i >= 0; i --){
            System.out.println(vetor[i] + " ");
        }
    }
}