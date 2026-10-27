import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    static final int TENTATIVAS_MAX = 10;

    public static int lerInt() {
        while (true) {
            try {
                int numero = sc.nextInt();
                sc.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas numeros!");
                sc.nextLine();
            }
        }
    }

    public static int escolherLimite() {
        System.out.println("Escolha o nivel da dificuldade: ");
        System.out.println("1 - Facil (1 a 50), 2 - Medio (1 a 100), 3 - Dificil (1 a 1000)");
        int escolha = lerInt();
        switch (escolha) {
            case 1: return 50;
            case 2: return 100;
            case 3: return 1000;
            default:
                System.out.println("Opção inválida, usando nível médio.");
                return 100;
        }
    }

    public static boolean jogar() {
        int limite = escolherLimite();
        int secreto = rd.nextInt(limite) + 1;
        System.out.println("Adivinhe o número de 1 a " + limite + "!");

        int tentativas = 1;
        while (tentativas <= TENTATIVAS_MAX) {
            System.out.println("Tentativa " + tentativas + " de " + TENTATIVAS_MAX + ". Qual seu palpite: ");
            int palpite = lerInt();

            if (palpite < 1 || palpite > limite) {
                System.out.println("Digite um número entre 1 e " + limite + " (esta tentativa não foi contada).");
                continue;
            }

            if (palpite == secreto) {
                System.out.println("Voce acertou em " + tentativas + " tentativas!");
                return true;
            }
            System.out.println(palpite < secreto ? "Maior!" : "Menor!");
            tentativas++;
        }

        System.out.println("As tentativas acabaram! O número era " + secreto + ".");
        return false;
    }

    public static void main(String[] args) {
        int jogarNovamente;
        do {
            jogar();
            System.out.println("Jogar novamente?");
            System.out.println("1 - Sim, 2 - Não");
            jogarNovamente = lerInt();
        } while (jogarNovamente == 1);
        System.out.println("Até a próxima!");
    }
}