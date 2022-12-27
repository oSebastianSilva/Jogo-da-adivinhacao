import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);
    Integer[] point = new Integer[50];
    String[] select = new String[50];
    int[] contador = new int[50];
    Integer fluxo = 0, jogo = 9;

    while (jogo != 0) {
      Random random = new Random();
      int numero = random.nextInt(51);

      Random dificult2 = new Random();
      int valor = dificult2.nextInt(71);

      Random dificult3 = new Random();
      int valor2 = dificult3.nextInt(101);

      System.out.println("\n - Jogo da Adivinhação - \n\n[1] Iniciar Jogo\n[2] Pontuação\n[3] Informações de Jogo\n[0] Sair");
      System.out.print("\nSelecione uma opção: ");
      int menu = ler.nextInt();

      switch (menu) {
        case 1:
          System.out.println(
              "\n - Modos de jogo, dificuldades -\n\n[1] FÁCIL: Possui um total de 15 tentativas, e uma pontuação máxima inicial de 100.\n\n[2] EQUILIBRADO: Possui 10 tentativas e a pontuação máxima inicial é 500.\n\n[3] DIFÍCIL: Possui 6 tentativas. Pontua mais que os outros modos, com um máximo de 1000.\n");

          System.out.print("Selecione a dificuldade para começar: ");
          int dificuldade = ler.nextInt();

          if (dificuldade == 1) {
            if (select[49] != null) System.out.println("\nA Memória do jogo lotou, por favor resete-o para jogar novamente! - A pontuação será deletada do histórico.\n");
            
            for (int i = 1; i <= 15; i++) {
              int pontos = 500;
              int pontuacao = (pontos / i);
              System.out.print("\nTentativa " + "(" + i + ")" + " de 15.\n");
              System.out.print(" - Insira um valor: ");
              int tentativa = ler.nextInt();

              if (i == 15 && tentativa != numero) {
                System.out.print("Você perdeu! O número secreto era " + numero + ".\n GAME OVER.\n");
                point[fluxo] = 0;
                select[fluxo] = "Fácil - (GAME OVER!)";
                contador[fluxo] = 15;
                fluxo += 1;

              } else if (tentativa == numero) {
                if (i == 1) {
                  System.out.println("Acertou de primeira, parabéns!\nPONTUAÇÃO MÁXIMA: EXP: +" + pontos + " Bônus: +15");
                  point[fluxo] = 515;
                  select[fluxo] = "Fácil - (A SORTE!)";
                  contador[fluxo] = i;
                  fluxo += 1;
                  i = 15;
                } else {
                  System.out.println("Parabéns, você acertou o número.\nEXP: +" + pontuacao);
                  point[fluxo] = pontuacao;
                  select[fluxo] = "Fácil - (VITÓRIA!)";
                  contador[fluxo] = i;
                  fluxo += 1;
                  i = 15;
                }
              } else if (tentativa > 50 || tentativa <= 0) {
                System.out.println("O seu digito está fora do parâmetro, preste atenção! -1 tentativa.");
              } else {
                if (tentativa > numero)
                  System.out.println("O digito é maior do que o número secreto.");
                else
                  System.out.println("O digito é menor que o número secreto.");
              }
            }

          } else if (dificuldade == 2) {
            if (select[49] != null) System.out.println("\nA Memória do jogo lotou, por favor resete-o para jogar novamente! - A pontuação será deletada do histórico.\n");
            
            for (int i = 1; i <= 10; i++) {
              int pontos = 750;
              int pontuacao = (pontos / i);
              System.out.print("\nTentativa " + "(" + i + ")" + " de 10.\n");
              System.out.print(" - Insira um valor: ");
              int tentativa = ler.nextInt();

              if (i == 10 && tentativa != valor) {
                System.out.print("Você perdeu! O número secreto era " + valor + ".\n GAME OVER.\n");
                point[fluxo] = 0;
                select[fluxo] = "Equilibrado - (GAME OVER!)";
                contador[fluxo] = 10;
                fluxo += 1;

              } else if (tentativa == valor) {
                if (i == 1) {
                  System.out.println("Acertou de primeira, parabéns!\nPONTUAÇÃO MÁXIMA: EXP: +" + pontos + " Bônus: +30");
                  point[fluxo] = 780;
                  select[fluxo] = "Equilibrado - (Acerto RARO!)";
                  contador[fluxo] = 1;
                  fluxo += 1;
                  i = 10;
                } else {
                  System.out.println("Parabéns, você acertou o número.\nEXP: +" + pontuacao);
                  point[fluxo] = pontuacao;
                  select[fluxo] = "Equilibrado - (VITÓRIA!)";
                  contador[fluxo] = i;
                  fluxo += 1;
                  i = 10;
                }
              } else if (tentativa > 70 || tentativa <= 0) {
                System.out.println("O seu digito está fora do parâmetro, preste atenção! -1 tentativa.");
              } else {
                if (tentativa > valor)
                  System.out.println(" O seu digito é maior do que o número secreto.");
                else
                  System.out.println(" O seu digito é menor que o número secreto.");
              }
            }

          } else if (dificuldade == 3) {
            if (select[49] != null) System.out.println("\nA Memória do jogo lotou, por favor resete-o para jogar novamente! - A pontuação será deletada do histórico.\n");
            
            for (int i = 1; i <= 6; i++) {
              int pontos = 1000;
              int pontuacao = (pontos / i);
              System.out.print("\nTentativa " + "(" + i + ")" + " de 6.\n");
              System.out.print(" - Insira um valor: ");
              int tentativa = ler.nextInt();

              if (i == 6 && tentativa != valor2) {
                System.out.print("Você perdeu! O número secreto era " + valor2 + ".\n GAME OVER.\n");
                point[fluxo] = 0;
                select[fluxo] = "Difícil - (GAME OVER!)";
                contador[fluxo] = 6;
                fluxo += 1;

              } else if (tentativa == valor2) {
                if (i == 1) {
                  System.out.println(" Acertou de primeira, parabéns!\nPONTUAÇÃO MÁXIMA: EXP: +" + pontos + " Bônus: +50");
                  point[fluxo] = 1050;
                  select[fluxo] = "Difícil - (Acerto CRÍTICO!)";
                  contador[fluxo] = i;
                  fluxo += 1;
                  i = 6;
                } else {
                  System.out.println(" Parabéns, você acertou o número.\nEXP: +" + pontuacao);
                  point[fluxo] = pontuacao;
                  select[fluxo] = "Difícil - (VITÓRIA!)";
                  contador[fluxo] = i;
                  fluxo += 1;
                  i = 6;
                }

              } else if (tentativa > 100 || tentativa <= 0) {
                System.out.println("O seu digito está fora do parâmetro, preste atenção! -1 tentativa.");
              } else {
                if (tentativa > valor2)
                  System.out.println(" O seu digito é maior do que o número secreto.");
                else
                  System.out.println(" O seu digito é menor que o número secreto.");
              }
            }

          } else {
            System.out.print("Opção de dificuldade indisponível.");
            break;
          }
          break;

        case 2:
          if (point[0] == null) {
            System.out.println("Para pontuar, antes é preciso jogar!");
            break;
          }

          System.out.println("\n - Pontuação - \n");
          for (int i = 0; i < point.length; i++) {
            if (point[i] == null)
              System.out.print("");
            else
              System.out.println((i + 1) + "º Jogo: " + point[i] + " pontos - Modo Jogado: " + select[i] + " - " + contador[i] + " tentativa(s) usadas.");
          }

          break;

        case 3:
          System.out.println("\n - Detalhes sobre as dificuldades do Jogo - \n");
          System.out.println(
              "> Configuração de Jogo padrão: Toda pontuação é dividida pelo número de tentativas utilizadas pelo jogador.\n");
          System.out.println(
              "Modo Fácil: Demorado e simples, o número de chances é grande (15), então perder é muito dificíl. O nível de pontuação é baixo - Recomendado para aqueles que só querem acertar o número a todo custo.\n");
          System.out.print(
              "Modo Equilibrado: Uma confrontação cujo número de tentativas é encurtado (10). A pontuação desse modo é mediana e não há dificuldade - Recomendado para aqueles que querem passar o tempo.\n\n");
          System.out.print("Modo Difícil: Nesta dificuldade, você só tem (6) tentativas. Boa sorte!\n");

          System.out.println("\n - Produção e Informações Gerais - \n");
          System.out.print(
              "Desenvolvido por, Sebastian Henrique da Silva.\nLocal: Floresta, PE (Brasil).\nProduzido em Java - Programação Estruturada.\n");
          break;

        case 0:
          System.out.print("\nTem certeza que deseja fechar o jogo? \n    - [1] SIM         [2] NÃO -\n\n > ");
          int decisao = ler.nextInt();
          if (decisao == 2)
            break;
          else if (decisao == 1) {
            System.out.print("Jogo finalizado.");
            return;
          } else
            System.out.println("\nDigito inserido não é válido.\n");
          break;

        default:
          System.out.println("Dígito inserido não corresponde. Tente novamente.\n");
          break;
      }
    }
    ler.close();
  }
}