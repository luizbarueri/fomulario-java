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

        panel.setLayout(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);
        panel.add(button, BorderLayout.EAST);

        // Adiciona um ActionListener para o botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ação a ser realizada ao clicar no botão
                JOptionPane.showMessageDialog(frame, "Botão Clicado!");
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