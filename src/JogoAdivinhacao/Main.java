package JogoAdivinhacao;

import java.util.Random;
import java.util.Scanner;

//Jogo de adivinhação, você consegue descobrir qual é o número secreto?

public class Main {
    public static void main(String[] args) {
        int numero = new Random().nextInt(100);
        int tentativa = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao jogo de adivinhação, você terá 5 tentativas para adivinhar o número secreto");
        System.out.println("Dica: Apenas números de 0 a 100");

        for (int x = 0 ; x < 5 ; x++){
            System.out.printf("\nTentativa número %d:\n", x + 1);
            tentativa = scanner.nextInt();

            if (tentativa == numero) {
                System.out.println("Parabéns!! você adivinhou o número secreto");
                break;
            } else if (tentativa < numero) {
                System.out.println("O número secreto é maior do que o número digitado");
            } else {
                System.out.println("O número secreto é menor do que o número digitado");
            }

        }

        if (numero == tentativa) {
            System.out.println("Você venceu o jogo!");
        } else {
            System.out.println("Game over... mais sorte da próxima vez");
            System.out.println("O número secreto era: " + numero);
        }



    }
}
