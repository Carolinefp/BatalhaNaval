import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Tabuleiro {
    private String[][] grid;



    public Tabuleiro() {
        grid = new String[16][16];
        
    
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 16; j++) {
                grid[i][j] = "v";
            }
        }
        Random rand = new Random();

        //for(int i = 0; i < 10; i++){
           // int linha = ran;
        
    }

    public void exibirTabuleiro() {
        for (String[] linha : grid) { //acrecenta as linha do tabuleiro
            for (String celula : linha) {
                System.out.print(celula + " "); // para que nao fique juntos  as linhas
            }
            System.out.println();
        }
    }

    public boolean atacar(int linha, int coluna) {
            if (linha < 0 || linha >= grid.length || coluna < 0 || coluna >= grid.length) { // se a linha faz o ataque no ponto escolido caso linha seja menor q 0 ou maior ou igual ao tamanho
            System.out.println("Jogada inválida."); // imprime que deu certo a jogada
            return false;
        }

        if (grid[linha][coluna].equals("1")) { // se a linha e a coluna for igualk a 1 informa que ja teve ataque 
            System.out.println("Posição já atacada.");
            return false;
        } else {
            grid[linha][coluna] = "1"; //se nao tiver ataque vai aparecer 1 
            return true;
        }
    }
}
