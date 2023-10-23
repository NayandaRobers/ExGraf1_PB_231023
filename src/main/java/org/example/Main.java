package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Exemplo JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Selecione uma cor:");
        panel.add(label);

        String[] cores = {"Azul", "Vermelho", "Preto", "Amarelo"};

        JComboBox<String> comboBox = new JComboBox<>(cores);
        panel.add(comboBox);



        JButton button = new JButton("Exibir cor Selecionado");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cores = (String) comboBox.getSelectedItem();
                switch (cores){
                    case "Azul":
                        panel.setBackground(Color.BLUE);
                        break;
                    case "Vermelho":
                        panel.setBackground(Color.RED);
                        break;
                    case "Preto":
                        panel.setBackground(Color.BLACK);
                        break;
                    case "Amarelo":
                        panel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });
        frame.setVisible(true);


 /*     JFrame frame = new JFrame("Exemplo JList");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 500);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Selecione uma fruta:");
        panel.add(label);

        String[] frutas = {"Maçã", "Banana"};

        JList<String> listaFrutas = new JList<>(frutas);
        listaFrutas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panel.add(new JScrollPane(listaFrutas));

        JButton button = new JButton("Exibir Fruta Selecionada");
        panel.add(button);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String frutaSelecionada = listaFrutas.getSelectedValue();

                if(frutaSelecionada!=null){
                    textField.setText(("Fruta Selecionada: " + frutaSelecionada));
                } else{
                    textField.setText(("Selecione uma fruta:"));
                }

            }
        });
        frame.setVisible(true);
*/





        /*JFrame frame = new JFrame("Exemplo Option Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Você gosta de programação Java?");
        panel.add(label);

        JRadioButton simRadioButton = new JRadioButton("Sim");
        JRadioButton naoRadioButton = new JRadioButton("Não");

        ButtonGroup grupoOpcoes = new ButtonGroup();
        grupoOpcoes.add(simRadioButton);
        grupoOpcoes.add(naoRadioButton);

        panel.add(simRadioButton);
        panel.add(naoRadioButton);

        JButton button = new JButton("Exibir opção selecionada");
        panel.add(button);

        JTextField textField = new JTextField(15);
        panel.add(textField);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String opcaoSelecionada = "";

                if(simRadioButton.isSelected()){
                    opcaoSelecionada = "Sim";
                }else if (naoRadioButton.isSelected()){
                    opcaoSelecionada = "Não";
                }
                textField.setText(opcaoSelecionada);
            }

        });
        frame.setVisible(true);*/

/*
        JFrame frame = new JFrame("Exemplo JComboBox");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Selecione um mês:");
        panel.add(label);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        JComboBox<String> comboBox = new JComboBox<>(meses);
        panel.add(comboBox);

        JTextField textField = new JTextField(15);
        panel.add(textField);


        JButton button = new JButton("Exibir Mês Selecionado");
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String meses = (String) comboBox.getSelectedItem();
                textField.setText(String.valueOf(meses));
            }
        });

        frame.setVisible(true);

*/
     /*JFrame frame = new JFrame("Exemplo JTextField");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel label = new JLabel("Digite seu nome");
        panel.add(label);

        JTextField textField = new JTextField(20);
        panel.add(textField);

        JButton button = new JButton("Saudação");
        panel.add(button);

        JLabel saudacaoLabel = new JLabel();
        panel.add(saudacaoLabel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textField.getText();
                if(!nome.isEmpty()){
                    saudacaoLabel.setText("nome = " + nome);

                }else{
                    saudacaoLabel.setText("Informe o nome: ");
                }
            }
        });
frame.setVisible(true);
*/
    }
    }