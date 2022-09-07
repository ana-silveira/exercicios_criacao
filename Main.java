package exercicioCriacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        // Mensagem
        System.out.println("Exercício Mensagem");
        System.out.println("Informe a hora atual (0 a 24):");
        int h = scan.nextInt();
        Mensagem.obterMensagem(h);
        System.out.println();

        //calculadora
        System.out.println("Calculadora");
        System.out.println("Informe dois números inteiros:");
        int x = scan.nextInt();
        int y = scan.nextInt();
        Calculadora.soma(x, y);
        Calculadora.subtracao(x, y);
        Calculadora.multiplicacao(x, y);
        Calculadora.divisao(x, y);
        System.out.println();

        // Empréstimo
        System.out.println("Exercício Empréstimo");
        System.out.println("Informe o valor desejado: ");
        int v = scan.nextInt();
        System.out.println("Informe o número de parcelas (2 ou 3): ");
        int p = scan.nextInt();
        Emprestimo.calcular(v, p);
    }
}
