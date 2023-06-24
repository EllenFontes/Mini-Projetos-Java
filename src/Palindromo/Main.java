package Palindromo;
import java.util.Scanner;

//Programa com o intuito de identificar se um número é ou não palindromo
public class Main {
    public static void main(String[] args) {

        Palindromo palindromo = new Palindromo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é palindromo");
        int numero = scanner.nextInt();

        System.out.println(palindromo.validacaoPalindromo(numero));

    }
}