package Palindromo;

public class Palindromo {
    private int numero;

    public String validacaoPalindromo(int numero) {
        this.numero = numero;
        String numeroToString = Integer.toString(this.numero);
        String numeroReverso = "";
        char temp;
        boolean palindromo;
        String mensagem = "";


        for (int i = numeroToString.length() - 1 ; i >= 0 ; i--) {
            temp = numeroToString.charAt(i);
            numeroReverso = numeroReverso + temp;
            }

        if (numeroToString.equals(numeroReverso)) {
            palindromo = true;
            mensagem = String.format("%s é palindromo", numeroToString);
        } else {
            palindromo = false;
            mensagem = String.format("%s não é palindromo",numeroToString);
        }


        return mensagem;
    }


    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }



}
