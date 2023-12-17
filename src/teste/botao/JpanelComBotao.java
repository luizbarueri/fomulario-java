package teste.botao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JpanelComBotao {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextField com Botão");
        JPanel panel = new JPanel();
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Botão");
        JButton button2 = new JButton("Botão_2");

        panel.setLayout(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.EAST);
        panel.add(button2, BorderLayout.AFTER_LAST_LINE);

        // Adiciona um ActionListener para o botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser realizada ao clicar no botão
                JOptionPane.showMessageDialog(frame, "Botão Clicado!");
            }
        });

        // Adiciona um ActionListener para o botão_2
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser realizada ao clicar no botão
                JOptionPane.showMessageDialog(frame, textField.getText() + "\n Botão 2 foi Clicado!");
            }
        });

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

/*
 Neste exemplo, um JPanel é criado para conter o JTextField e o JButton.
 O layout do JPanel é configurado para BorderLayout, o que coloca o JTextField
 no centro e o JButton à direita. Quando o botão é clicado, uma caixa de
 diálogo simples é exibida para indicar que o botão foi clicado.

 */