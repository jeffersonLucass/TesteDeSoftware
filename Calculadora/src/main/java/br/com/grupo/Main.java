package br.com.grupo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        int opcao;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double a = scanner.nextDouble();

                System.out.print("Digite o segundo número: ");
                double b = scanner.nextDouble();

                double resultado = 0;

                try {
                    switch (opcao) {
                        case 1:
                            resultado = calculadora.somar(a, b);
                            break;
                        case 2:
                            resultado = calculadora.subtrair(a, b);
                            break;
                        case 3:
                            resultado = calculadora.multiplicar(a, b);
                            break;
                        case 4:
                            resultado = calculadora.dividir(a, b);
                            break;
                    }

                    System.out.println("Resultado: " + resultado);

                } catch (ArithmeticException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }

        } while (opcao != 0);

        System.out.println("Encerrando...");
        scanner.close();
    }
}