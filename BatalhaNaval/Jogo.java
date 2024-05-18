import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Jogo {
    private Jogador[] jogadores;
    private boolean jogoEmAndamento = true; // jogo continua se for verdadeiro 

    public Jogo(Jogador jogador1, Jogador jogador2) { // quantidade de jogador
        jogadores = new Jogador[]{jogador1, jogador2}; //
    }

    public void iniciarJogo(Tabuleiro tabuleiro) { // Adicionado o parâmetro Tabuleiro
        int jogadorAtualIndex = 0; // controla a troca de jogadores p jogadas
        while (jogoEmAndamento) { // lopp 
            Jogador jogadorAtual = jogadores[jogadorAtualIndex];
            Jogador outroJogador = jogadores[(jogadorAtualIndex + 1) % jogadores.length]; // alterna entre 0 e 1  alternando jogador
            System.out.println(jogadorAtual.getNome() + ", é sua vez:"); 
            tabuleiro.exibirTabuleiro(); // mostra tabuleiro do jogador atual
            jogadorAtual.fazerJogada(outroJogador, tabuleiro); // faz a jogada no tabuleiro do outro jogador

            if (outroJogador.venceu()) {
                jogoEmAndamento = false;
                System.out.println("Parabéns, " + jogadorAtual.getNome() + "! Você venceu o jogo.");
            }

            jogadorAtualIndex = (jogadorAtualIndex + 1) % jogadores.length;
        }
    }
}
