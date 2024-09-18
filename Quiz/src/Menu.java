import Dados.Quiz;

public class Menu {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();
        int numeroAcertos = quiz.iniciarQuiz();
        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas, você acertou: " + numeroAcertos);
    }
}
