import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Jogo {
    private Jogador[] jogadores;
    private int jogadorAtualIndex;
    private boolean jogoEmAndamento;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        jogadores = new Jogador[]{jogador1, jogador2};
        jogadorAtualIndex = 0;
        jogoEmAndamento = true;
    }

    public void iniciarJogo() {
        while (jogoEmAndamento) {
            Jogador jogadorAtual = jogadores[jogadorAtualIndex];
            Jogador outroJogador = jogadores[(jogadorAtualIndex + 1) % jogadores.length];
            System.out.println(jogadorAtual.getNome() + ", é sua vez:");
            jogadorAtual.exibirTabuleiro();
            jogadorAtual.fazerJogada(outroJogador);

            if (outroJogador.todosNaviosAfundados()) {
                jogoEmAndamento = false;
                System.out.println("Parabéns, " + jogadorAtual.getNome() + "! Você venceu o jogo.");
            }

            jogadorAtualIndex = (jogadorAtualIndex + 1) % jogadores.length;
        }
    }
}
