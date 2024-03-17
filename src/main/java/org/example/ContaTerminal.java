package org.example;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo = 10.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite seu nome !");
        String inputNome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        int inputNumeroAgencia = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite sua Agência !");
        String inputAgencia = scanner.nextLine();

        System.out.println("Olá " + inputNome + ", obrigado por criar uma conta em nosso banco, sua agência é " + inputAgencia + ", conta " + inputNumeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
