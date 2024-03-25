import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) throws java.lang.Exception {
        int numeroAcertos = 0;
        System.out.println("==================================================");
        System.out.println("           Bem-vindo ao Quiz de " + 
                                    "Bruno Custodio de castro Silva");
        System.out.println("             Faculdade: UNIFAN");
        System.out.println("                Professor: Brenno");
        System.out.println("            Tema: Avatar - A lenda de Aang");
        System.out.println("==================================================");
        System.out.println();
        System.out.println("===== Quiz: Avatar - A Lenda de Aang =====");
        numeroAcertos += grupo2();
        System.out.println("Fim do Quiz! Parabéns... De 15 perguntas, você acertou: " + numeroAcertos);
    }

    public static int grupo2() {
        int cont = 0; // contador de respostas corretas
        String respostaUsuario = "";
        System.out.println("=========================================================================");

        // Questão 1
        Questao questao1 = new Questao();
        questao1.pergunta = "1)Qual seria a tarefa de um avatar?";
        questao1.opcaoA = "a) Imperador dos elementos";
        questao1.opcaoB = "b) Ponte da paz para os espíritos e humanos";
        questao1.opcaoC = "c) Ser um Andarilho";
        questao1.opcaoD = "d) Ser um espírito entre os humanos";
        questao1.opcaoE = "e) Nenhuma tarefa específica";
        questao1.correta = "b"; // Resposta correta é a opção b
        questao1.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao1.isCorreta(respostaUsuario)) {
            cont++;
        }

        System.out.println("=========================================================================");

        // Questão 2
        Questao questao2 = new Questao();
        questao2.pergunta = "2)Qual Avatar não tinha perdão para os seus inimigos?";
        questao2.opcaoA = "a) Avatar Roku";
        questao2.opcaoB = "b) Avatar Aang";
        questao2.opcaoC = "c) Avatar Kioshi";
        questao2.opcaoD = "d) Avatar Kuruk";
        questao2.opcaoE = "e) Todos acima";
        questao2.correta = "c"; // Resposta correta é a opção c
        questao2.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao2.isCorreta(respostaUsuario)) {
            cont++;
        }

        // Questão 3
        Questao questao3 = new Questao();
        questao3.pergunta = "3)Quem é o dominador de terra mais forte na era do Aang?";
        questao3.opcaoA = "a) Toph";
        questao3.opcaoB = "b) Aang";
        questao3.opcaoC = "c) Rei Bumi";
        questao3.opcaoD = "d) Haru";
        questao3.opcaoE = "e) Poi";
        questao3.correta = "a"; // Resposta correta é a opção a
        questao3.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao3.isCorreta(respostaUsuario)) {
            cont++;
        }

        // Questão 4
        Questao questao4 = new Questao();
        questao4.pergunta = "4)Qual sub-dobra é proibida?";
        questao4.opcaoA = "a) Dobra de relâmpagos";
        questao4.opcaoB = "b) Dobra de Lava";
        questao4.opcaoC = "c) Dobra de Combustão";
        questao4.opcaoD = "d) Dobra espiritual";
        questao4.opcaoE = "e) Dobra de Sangue";
        questao4.correta = "e"; // Resposta correta é a opção e
        questao4.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao4.isCorreta(respostaUsuario)) {
            cont++;
        }

        // Questão 5
        Questao questao5 = new Questao();
        questao5.pergunta = "5)Depois da guerra de 1000 anos, o que a Toph fez?";
        questao5.opcaoA = "a) Abriu uma igreja";
        questao5.opcaoB = "b) Fundou uma pastelaria";
        questao5.opcaoC = "c) Fundou uma república";
        questao5.opcaoD = "d) Fundou um Dojo";
        questao5.opcaoE = "e) Casou com o Sokka";
        questao5.correta = "d"; // Resposta correta é a opção d
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao5.isCorreta(respostaUsuario)) {
            cont++;
        }
        // Questão 6
        Questao questao6 = new Questao();
        questao6.pergunta = "6)Qual é a principal arma do Sokka?";
        questao6.opcaoA = "a) Espada";
        questao6.opcaoB = "b) Boomerang";
        questao6.opcaoC = "c) Lança";
        questao6.opcaoD = "d) Punhos";
        questao6.opcaoE = "e) Nenhum das opções";
        questao6.correta = "b"; // Resposta correta é a opção b
        questao6.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao6.isCorreta(respostaUsuario)) {
            cont++;
        }
        // Questão 7
        Questao questao7 = new Questao();
        questao7.pergunta = "7)Quem confiou no Zuko primeiro?";
        questao7.opcaoA = "a) Appa";
        questao7.opcaoB = "b) Momo";
        questao7.opcaoC = "c) Toph";
        questao7.opcaoD = "d) Katara";
        questao7.opcaoE = "e) Aang";
        questao7.correta = "a"; // Resposta correta é a opção a
        questao7.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao7.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 8
        Questao questao8 = new Questao();
        questao5.pergunta = "8)Aang aprendeu a verdadeira dobra do Fogo com...?";
        questao5.opcaoA = "a) Zuko";
        questao5.opcaoB = "b) Azula";
        questao5.opcaoC = "c) Dragões";
        questao5.opcaoD = "d) Azulon";
        questao5.opcaoE = "e) Tio Iroh";
        questao5.correta = "c"; // Resposta correta é a opção c
        questao5.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao8.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 9
        Questao questao9 = new Questao();
        questao9.pergunta = "9)Qual era o apelido de luta da Toph?";
        questao9.opcaoA = "a) Bandida cega";
        questao9.opcaoB = "b) Dobradora cega";
        questao9.opcaoC = "c) Bruta cega";
        questao9.opcaoD = "d) Malandra cega";
        questao9.opcaoE = "e) Kid cega";
        questao9.correta = "a"; // Resposta correta é a opção a
        questao9.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao9.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 10
        Questao questao10 = new Questao();
        questao10.pergunta = "10)Qual o nome do primeiro Avatar?";
        questao10.opcaoA = "a) Avatar Wan";
        questao10.opcaoB = "b) Avatar Roku";
        questao10.opcaoC = "c) Avatar Bolin";
        questao10.opcaoD = "d) Avatar Kyoshi";
        questao10.opcaoE = "e) Avatar Tairon";
        questao10.correta = "a"; // Resposta correta é a opção a
        questao10.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao10.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 11
        Questao questao11 = new Questao();
        questao11.pergunta = "11)Quem foi o Avatar que só bebeu, namorou e lutou por capricho?";
        questao11.opcaoA = "a) Avatar Aang";
        questao11.opcaoB = "b) Avatar Yangchen";
        questao11.opcaoC = "c) Avatar Kyoshi";
        questao11.opcaoD = "d) Avatar Jairon";
        questao11.opcaoE = "e) Avatar Kurok";
        questao11.correta = "e"; // Resposta correta é a opção e
        questao11.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao11.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 12
        Questao questao12 = new Questao();
        questao12.pergunta = "12)Qual a dobra o Aang teve dificuldade em aprender?";
        questao12.opcaoA = "a) Fogo";
        questao12.opcaoB = "b) Terra";
        questao12.opcaoC = "c) Aguá";
        questao12.opcaoD = "d) Ar";
        questao12.opcaoE = "e) Não teve dificuldade";
        questao12.correta = "b"; // Resposta correta é a opção b
        questao12.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao12.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 13
        Questao questao13 = new Questao();
        questao13.pergunta = "13)No Episodio:Zuko Sozinho, Zuko começou o episodio em estado...";
        questao13.opcaoA = "a) De fome e cede";
        questao13.opcaoB = "b) De medo";
        questao13.opcaoC = "c) De ciumes";
        questao13.opcaoD = "d) De franja";
        questao13.opcaoE = "e) De trem de ferro";
        questao13.correta = "a"; // Resposta correta é a opção a
        questao13.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao13.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 14
        Questao questao14 = new Questao();
        questao14.pergunta = "14)Qual acontecimento fez Iroh abandonar seu cargo como General?";
        questao14.opcaoA = "a) Perdeu sua Esposa";
        questao14.opcaoB = "b) Perdeu seu animal de estimação";
        questao14.opcaoC = "c) Perdeu seu Filho";
        questao14.opcaoD = "d) Perdeu seu exercito";
        questao14.opcaoE = "e) Perdeu sua amante";
        questao14.correta = "c"; // Resposta correta é a opção c
        questao14.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao14.isCorreta(respostaUsuario)) {
            cont++;
        } // Questão 15
        Questao questao15 = new Questao();
        questao15.pergunta = "15)Avatar Yanchen é do Elemento:";
        questao15.opcaoA = "a) Fogo";
        questao15.opcaoB = "b) Terra";
        questao15.opcaoC = "c) Aguá";
        questao15.opcaoD = "d) Ar";
        questao15.opcaoE = "e) Não era Dobradora";
        questao15.correta = "d"; // Resposta correta é a opção d
        questao15.escrevaQuestao();
        respostaUsuario = leiaResposta();
        if (questao15.isCorreta(respostaUsuario)) {
            cont++;
        }

        return cont;
    }

    public static String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a letra correspondente à sua resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }

    public static boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
                resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
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
