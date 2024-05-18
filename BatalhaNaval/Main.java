import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao jogo Batalha Naval!");

        System.out.print("Digite o nome do primeiro jogador: ");
        String nomeJogador1 = scanner.nextLine();
        Jogador jogador1 = new Jogador(nomeJogador1);

        System.out.print("Digite o nome do segundo jogador: ");
        String nomeJogador2 = scanner.nextLine();
        Jogador jogador2 = new Jogador(nomeJogador2);

        Tabuleiro tabuleiro = new Tabuleiro();

        Jogo jogo = new Jogo(jogador1, jogador2);
        jogo.iniciarJogo(tabuleiro);

        scanner.close();
    }
}

