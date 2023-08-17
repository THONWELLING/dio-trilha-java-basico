package org.thonwelling;

import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(999999 - 100000 + 1) + 100000;
        String agencia;
        String nomeCliente;
        double saldo;


        Scanner terminal = new Scanner(System.in);
        System.out.println("Por Favor, Digite o Número da Agência! ");
            agencia = terminal.nextLine();
        if (!agencia.isEmpty()) {
            System.out.println("Por Favor, Digite Seu Nome! ");
                nomeCliente = terminal.nextLine();
            if (!nomeCliente.isEmpty()){
                System.out.println("Agora Digite o Saldo Inicial da sua Conta! ");
                    saldo = terminal.nextDouble();
                if (saldo < 0 ){
                    saldo = 0;
                }
                String mensagem = String.format("Olá, %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
                System.out.println(mensagem);
            } else {
                System.out.println("Nome é Obrigatório!");
            }
        } else {
            System.out.println("Agência é Obrigatório!");
        }
    }
}