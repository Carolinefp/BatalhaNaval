import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Jogador {
    private String nome;
    private int pontuacao;

    public Jogador(String nome) {
        this.nome = nome; //armazena o nome
        this.pontuacao = 0;
    }

    public String getNome() { // retona com o nome 
        return nome;
    }

    public void fazerJogada(Jogador outroJogador, Tabuleiro tabuleiroOutroJogador) { //// metodo q permite o jogador fazer ataque no tabuleiro
        Scanner scanner = new Scanner(System.in); // le a entrada do jogador
        System.out.println("Digite as coordenadas para atacar (linha coluna):"); // imprime a orientacao
        int linha = scanner.nextInt(); // le a linha indicada
        int coluna = scanner.nextInt();

        if (tabuleiroOutroJogador.atacar(linha, coluna)) { //  metodo p verifcar SE acertou  OU nao 
            System.out.println("Ataque bem sucedido!");
            ganharPonto();
        } else {
            System.out.println("Ataque falhou!");
        }
    }

    public void ganharPonto() {
        pontuacao++; // para fazer a pontuacao certa
    }

    public boolean venceu() {
        return pontuacao == 5; // verifica que ganhou
    }
}
