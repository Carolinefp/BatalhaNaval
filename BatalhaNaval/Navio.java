import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Navio {
    private int tamanho;
    private int[] posicao;
    private boolean[] partesAtingidas;

    public Navio(int tamanho) { // construtor p iniciar um navio com um tamanho especifico
        this.tamanho = tamanho; // attribiu o tamanho do navio no tamanho
        posicao = new int[tamanho]; // array com o tamanho do navio
        partesAtingidas = new boolean[tamanho]; // array para dizer se foi ou nao atingido
        for (int i = 0; i < tamanho; i++) { // se i for menor que tamanho vai inclementar 1 
            partesAtingidas[i] = false; // retornando que nao foi atingido 
        }
    }
    
    public boolean atingir(int parte) { //metodo para atacar
        if (parte < 0 || parte >= tamanho) { // verifica se ta dentor do limite do navio 
            return false;
        }
        if (partesAtingidas[parte]) { // se foi atingido retorna
            return false;
        }

        partesAtingidas[parte] = true; // marca como atingido
        return true;
    }

    public boolean foiAfundado() {
        for (boolean atingida : partesAtingidas) {
            if (!atingida) {
                return false;
            }
        }
        
        return true;
    }
}
