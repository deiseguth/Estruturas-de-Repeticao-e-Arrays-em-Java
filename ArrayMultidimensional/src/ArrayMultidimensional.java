import java.util.Random;

/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
 */


public class ArrayMultidimensional {
    public static void main(String[] args){
        Random random = new Random();
// i é linha
        int [] [] Matriz = new int [4][4];

        for(int i = 0; i < Matriz.length; i++){
            for (int coluna = 0; coluna < Matriz[i].length; coluna++){
                Matriz[i][coluna] = random.nextInt(9);
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : Matriz) {
            for (int elementoDaColuna : linha){
                System.out.print(elementoDaColuna + " ");
            }
            System.out.println();
        }
    }
}