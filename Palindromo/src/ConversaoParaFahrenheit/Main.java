package ConversaoParaFahrenheit;
import java.util.Scanner;

//Programa com o intuito de converter graus Celsius para Fahrenheit

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f ºC equivalem a %.2f ºf", celsius, fahrenheit);
    }
}
