import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Tabuleiro {
    private int[][] grid;

    public Tabuleiro(int size) {
        grid = new int[size][size];
        // Inicialize o tabuleiro com água (0)
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = 0;
            }
        }
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean atacar(int linha, int coluna) {
        if (linha < 0 || linha >= grid.length || coluna < 0 || coluna >= grid.length) {
            System.out.println("Jogada inválida.");
            return false;
        }

        if (grid[linha][coluna] == 1) {
            System.out.println("Posição já atacada.");
            return false;
        } else {
            grid[linha][coluna] = 1;
            return true;
        }
    }
}
