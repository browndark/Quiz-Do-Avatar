package Dados;
import java.util.Scanner;

public class Quiz {
    public int iniciarQuiz() {
        int cont = 0;
        String respostaUsuario;

        System.out.println("==================================================");
        System.out.println("           Bem-vindo ao Quiz de " +
                "Bruno Custodio de castro Silva");
        System.out.println("             Faculdade: UNIFAN");
        System.out.println("                Professor: Brenno");
        System.out.println("            Tema: Avatar - A lenda de Aang");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("===== Quiz: Avatar - A Lenda de Aang =====");

        cont += fazerQuestao("1) Qual seria a tarefa de um avatar?",
                "a) Imperador dos elementos",
                "b) Ponte da paz para os espíritos e humanos",
                "c) Ser um Andarilho",
                "d) Ser um espírito entre os humanos",
                "e) Nenhuma tarefa específica",
                "b");

        cont += fazerQuestao("2) Qual Avatar não tinha perdão para os seus inimigos?",
                "a) Avatar Roku",
                "b) Avatar Aang",
                "c) Avatar Kioshi",
                "d) Avatar Kuruk",
                "e) Todos acima",
                "c");

        cont += fazerQuestao("3) Quem é o dominador de terra mais forte na era do Aang?",
                "a) Toph",
                "b) Aang",
                "c) Rei Bumi",
                "d) Haru",
                "e) Poi",
                "a");

        cont += fazerQuestao("4) Qual sub-dobra é proibida?",
                "a) Dobra de relâmpagos",
                "b) Dobra de Lava",
                "c) Dobra de Combustão",
                "d) Dobra espiritual",
                "e) Dobra de Sangue",
                "e");

        cont += fazerQuestao("5) Depois da guerra de 1000 anos, o que a Toph fez?",
        "a)Abriu uma igreja?",
        "b) Fundou uma pastelaria",
        "c) Fundou uma república",
        "d) Fundou um Dojo",
        "e) Casou com o Sokka",
        "d");


        cont+= fazerQuestao("6)Qual é a principal arma do Sokka?",
        "a) Espada",
        "b) Boomerang",
        "c) Lança",
        "d) Punhos",
        "e) Nenhum das opções",
        "b");

        cont+= fazerQuestao("7)Quem confiou no Zuko primeiro?",
        "a) Appa",
        "b) Momo",
        "c) Toph",
        "d) Katara",
        "e) Aang",
        "a");

        cont+= fazerQuestao("8)Aang aprendeu a verdadeira dobra do Fogo com...?",
        "a) Zuko",
        "b) Azula",
        "c) Dragões",
        "d) Azulon",
        "e) Tio Iro",
        "c");

        cont+= fazerQuestao("9)Qual era o apelido de luta da Toph?",
        "a) Bandida cega",
        "b) Dobradora cega",
        "c) Bruta cega",
        "d) Malandra cega",
        "e) Kid cega",
        "a");

        cont+= fazerQuestao("10)Qual o nome do primeiro Avatar?",
        "a) Avatar Wan",
        "b) Avatar Roku",
        "c) Avatar Bolin",
        "d) Avatar Kyoshi",
        "e) Avatar Tairon",
        "a");

        cont+= fazerQuestao("11)Quem foi o Avatar que só bebeu, namorou e lutou por capricho?",
        "a) Avatar Aang",
        "b) Avatar Yangchen",
        "c) Avatar Kyoshi",
        "d) Avatar Jairon",
        "e) Avatar Kurok",
        "e");

        cont+= fazerQuestao("12)Qual a dobra o Aang teve dificuldade em aprender?",
        "a) Fogo",
        "b) Terra",
        "c) Aguá",
        "d) Ar",
        "e) Não teve dificuldade",
        "b");

        cont+= fazerQuestao("13)No Episodio:Zuko Sozinho, Zuko começou o episodio em estado...",
        "a) De fome e cede",
        "b) De medo",
        "c) De ciumes",
        "d) De franja",
        "e) De trem de ferro",
        "a");

        cont+= fazerQuestao("14)Qual acontecimento fez Iroh abandonar seu cargo como General?",
        "a) Perdeu sua Esposa",
        "b) Perdeu seu animal de estimação",
        "c) Perdeu seu Filho",
        "d) Perdeu seu exercito",
        "e) Perdeu sua amante",
        "c");

        cont+= fazerQuestao("15)Avatar Yanchen é do Elemento:",
        "a) Fogo",
        "b) Terra",
        "c) Aguá",
        "d) Ar",
        "e) Não era Dobradora",
        "d");


        return cont;
    }

    private int fazerQuestao(String pergunta, String opcaoA, String opcaoB, String opcaoC,
                             String opcaoD, String opcaoE, String correta) {
        Questao questao = new Questao();
        questao.pergunta = pergunta;
        questao.opcaoA = opcaoA;
        questao.opcaoB = opcaoB;
        questao.opcaoC = opcaoC;
        questao.opcaoD = opcaoD;
        questao.opcaoE = opcaoE;
        questao.correta = correta;
        questao.escrevaQuestao();
        String respostaUsuario = leiaResposta();
        return questao.isCorreta(respostaUsuario) ? 1 : 0;
    }

    private String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a letra correspondente à sua resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") ||
                resp.equalsIgnoreCase("C") || resp.equalsIgnoreCase("D") ||
                resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida ... ");
        return false;
    }

    public static class Questao {
        String pergunta = "";
        String opcaoA = "";
        String opcaoB = "";
        String opcaoC = "";
        String opcaoD = "";
        String opcaoE = "";
        String correta = "";

        public boolean isCorreta(String resposta) {
            if (resposta.equalsIgnoreCase(this.correta)) {
                System.out.println("Parabéns! Resposta Correta!");
                return true;
            } else {
                System.out.println("Resposta Errada!");
                System.out.println("A opção correta é a letra: " + this.correta);
                return false;
            }
        }

        public void escrevaQuestao() {
            System.out.println(this.pergunta);
            System.out.println(this.opcaoA);
            System.out.println(this.opcaoB);
            System.out.println(this.opcaoC);
            System.out.println(this.opcaoD);
            System.out.println(this.opcaoE);
        }
    }
}
