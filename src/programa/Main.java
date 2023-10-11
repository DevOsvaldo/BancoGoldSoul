package programa;

import entidade.ContaBancaria;

import javax.swing.*;


import java.util.Locale;


    public class Main {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            ContaBancaria conta;
            double valorInicial;
            //Boas vindas do banco
            JOptionPane.showMessageDialog(null,"BEM VINDO AO BANCO GOLD SOUL",
                    "BANCO GOLD SOUL",JOptionPane.INFORMATION_MESSAGE);

            //Recebe o nome do titular da conta
            String nome = JOptionPane.showInputDialog(null,"Informe o nome do titular: ",
                    "Nome do titular",JOptionPane.INFORMATION_MESSAGE);
            //recebe a string que representa o numero da conta.
            String info1 = JOptionPane.showInputDialog(null,"Informe o numero da conta bancaria:  Ex:0000",
                    "Numero da Conta",JOptionPane.INFORMATION_MESSAGE);
            //passando de String para inteiro a resposta do usuário
            int numeroConta = Integer.parseInt(info1);
            //uma verificação de depósito inicial no ato do cadastro da conta
            int initValor = JOptionPane.showConfirmDialog(null,"Você fará um deposito inicial?");
            if(initValor == 0){
                String respt = JOptionPane.showInputDialog("Favor inserir o valor: Ex:200.00  ");
                valorInicial= Double.parseDouble(respt);
            } else{
                valorInicial = 0;
            }
            System.out.println(valorInicial);
            conta = new ContaBancaria();

            conta.setValorInicial(valorInicial);
            double saldo = conta.getSaldo();
            conta = new ContaBancaria(numeroConta,nome,saldo,valorInicial);

            //Atualização da conta do usuário
            System.out.println(conta.accountData());
            JOptionPane.showMessageDialog(null,conta.accountData());

            String deposit ="0.00";//variável temporária para armazenar a string recebida do usuário
            int info2 = JOptionPane.showConfirmDialog(null,"Você fará um deposito? ");
            if(info2 == 0) {
                deposit = JOptionPane.showInputDialog(null, "INSIRA O VALOR DO DEPOSITO: Ex:200.00",
                        "Valor do Deposito", JOptionPane.INFORMATION_MESSAGE);
            }
            double valorDeposito = Double.parseDouble(deposit);
            conta.deposito(valorDeposito);

            JOptionPane.showMessageDialog(null,conta.accountData());
            String saque;//variável temporária
            int info3 = JOptionPane.showConfirmDialog(null,"Você fará um saque? ");
            if(info3 == 0){
               saque = JOptionPane.showInputDialog(null, "INSIRA O VALOR DO DEPOSITO: Ex:200.00",
                        "Valor de Saque", JOptionPane.INFORMATION_MESSAGE);
               JOptionPane.showMessageDialog(null,"LEMBRANDO QUE SAQUE TEM UM TAXA DE $5.00",
                       "**ATENÇÃO**",JOptionPane.WARNING_MESSAGE);
            } else{
                saque = "0.00";
            }
            double valorSaque = Double.parseDouble(saque);
            conta.saque(valorSaque);
            JOptionPane.showMessageDialog(null,conta.accountData());
            System.exit(0);









    }
}
