package ContaBancaria;

import java.util.Scanner;

public class Sistema {
    private String nome;
    private String tipoConta;
    private double saldo;

    public void identificacao() {
        System.out.println("Bem vindo ao sistema bancario, identifique-se antes de prosseguir.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        this.nome = scanner.nextLine();

        System.out.println("Qual o tipo da sua conta, corrente ou poupança?");
        this.setTipoConta(scanner.nextLine());

        System.out.println("Qual o saldo da sua conta?");
        this.setSaldo(scanner.nextDouble());

        this.boasVindas();
    }


    public void boasVindas() {
        System.out.println("*".repeat(40));

        System.out.printf("Dados iniciais do cliente:\n\nNome: %s\nTipo de conta: %s\nSaldo: %.2f\n\n"
                , this.getNome(), this.getTipoConta(), this.getSaldo());

        System.out.println("*".repeat(40));

        this.menu();

    }

    public void consultarSaldo() {
        System.out.println("O saldo atual é de: " + this.getSaldo());
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 4) {

            System.out.printf("\nSelecione a operação desejada:\n\n1- Consultar saldo\n2- Receber valor\n3-Transferir valor\n4-Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    this.consultarSaldo();
                    break;
                case 2:
                    this.receberValor();
                    break;
                case 3:
                    this.transferirValor();
                    break;
                case 4:
                    System.out.println("Obrigado pela preferencia, nos vemos na próxima!");
                    break;
                default:
                    System.out.println("Opcão inválida");
            }
        }
    }



    public void receberValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o valor a ser recebido?");
        this.setSaldo(this.getSaldo() + scanner.nextDouble());

        System.out.println("O novo saldo é de: " + getSaldo());

    }

    public void transferirValor() {
        Scanner scanner = new Scanner(System.in);
        double temp = 0;
        System.out.println("Digite o valor a ser transferido");
        temp = this.getSaldo() - scanner.nextDouble();
        if (temp < 0) {
            System.out.println("Não é possivel transferir um valor maior que seu saldo!!\nSaldo atual: " + this.getSaldo());

        } else {
            this.setSaldo(temp);
            System.out.println("Valor transferido com sucesso, saldo atual: " + this.getSaldo());
        }

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
