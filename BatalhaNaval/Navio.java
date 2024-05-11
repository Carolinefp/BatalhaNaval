import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


public class Navio {
    private int tamanho;
    private int[] posicao;
    private boolean[] partesAtingidas;

    public Navio(int tamanho) {
        this.tamanho = tamanho;
        posicao = new int[tamanho];
        partesAtingidas = new boolean[tamanho];
        for (int i = 0; i < tamanho; i++) {
            partesAtingidas[i] = false;
        }
    }
    
    public boolean atingir(int parte) {
        if (parte < 0 || parte >= tamanho) {
            return false;
        }
        if (partesAtingidas[parte]) {
            return false;
        }

        partesAtingidas[parte] = true;
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
