package entidade;
import javax.swing.*;
public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    private double valorInicial = 0.00;
    private static double taxa = 5.00;
    public ContaBancaria(){}
    public ContaBancaria(int numeroConta, String nomeTitular,double saldo, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.valorInicial = valorInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setValorInicial(double valorInicial) {
        if(valorInicial!= 0){
            saldo += valorInicial;
        }
        this.valorInicial = valorInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public static double getTaxa() {
        return taxa;
    }

    public void deposito(double valorDeposito){
        saldo += valorDeposito;

    }
    public void saque(double valorSaque){
        if(saldo < 0.00 || saldo < valorSaque + taxa){
            saldo -= valorSaque + taxa;
            System.out.println("Seu saldo é inferior ao saque!");
            JOptionPane.showMessageDialog(null,"VOCÊ ESTÁ SEM SALDO PARA ESTE SAQUE.",

                    "**ATENÇÃO**",JOptionPane.WARNING_MESSAGE);
        }else if(valorSaque == 0.00){
            JOptionPane.showMessageDialog(null,"SAQUE NÃO REALIZADO");
        }
        else{
            System.out.println("Sucesso");
            saldo -= valorSaque + taxa;
            JOptionPane.showMessageDialog(null,"SAQUE REALIZADO COM SUCESSO. AGUARDE AS CÉDULAS",

                    "INFORMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
        }


    }
    public String accountData(){
        return "Account: "+numeroConta+
                ", Titular: "+nomeTitular+
                ",Balance: "+"$"+saldo;
    }
}
