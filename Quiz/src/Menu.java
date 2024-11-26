package Quiz.src;

import Dados.Quiz;

public class Menu {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        int numeroAcertos = quiz.iniciarQuiz();

        int totalDePerguntas = 15;

        double porcentagemAcertos = (double) numeroAcertos / totalDePerguntas * 100;

        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas, você acertou : " + numeroAcertos);
        System.out.printf("Porcentagem de acertos: %.2f%%\n", porcentagemAcertos);


        }
    }


