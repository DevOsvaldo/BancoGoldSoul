package programa;

import javax.swing.*;

public class TESTE {
    public static void main(String[] args) {
        String[] escolha = {"entre 1 e 20anos", "entre 21 e 40 anos", "mais de 40 anos"};
        int resp = JOptionPane.showOptionDialog(null,"Qual a sua idade","idade",0,JOptionPane.QUESTION_MESSAGE, null,
                escolha, escolha[0]);
        String idade = escolha[resp];
        JOptionPane.showMessageDialog(null,"Foi informado: "+idade,"Informação",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
