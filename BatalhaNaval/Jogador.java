import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Jogador {
    private String nome;
    private Tabuleiro tabuleiro;
    private int colocarNavios;

    public Jogador(String nome) {
        this.nome = nome;
        this.tabuleiro = new Tabuleiro();
        this.tabuleiro = colocarNavios();
    }
private Tabuleiro colocarNavios(){
    Random random = new Random();
    int [][] navios = new int[3][3];
    for(int i = 0; i < navios.length; i++){
        int linha = random.nextInt(16);
        int coluna= random.nextInt(16);
        navios [0][1]= linha;
        navios [1][0]= coluna;
    }
    tabuleiro Tabuleiro = new Tabuleiro(colocarNavios);
    return tabuleiro;
}
    public String getNome() {
        return nome;
    }

    public void exibirTabuleiro() {
        tabuleiro.exibirTabuleiro();
    }

    public void fazerJogada(Jogador outroJogador) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a linha e a coluna para fazer a jogada (no formato 'linha coluna'): ");
        int linha = scanner.nextInt();
        int coluna = scanner.nextInt();
        // Adicione a lógica para atacar no tabuleiro do outro jogador aqui
    }
    

    public boolean todosNaviosAfundados() {
        // Adicione a lógica para verificar se todos os navios afundaram
        return false;
    }
}
