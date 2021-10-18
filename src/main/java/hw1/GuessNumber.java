package hw1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessNumber extends JFrame {
    private int randomNumber;
    private JTextField textField;
    private JTextArea textArea;
    private int tryNumber;

    public GuessNumber() {
        this.tryNumber = 0;
        randomNumber = (int)(Math.random() * 10) + 1; // [1 ; 10]

        setTitle("Guess the number");
        setBounds(600, 300, 600, 140);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        textField = new JTextField();
        add(textField, BorderLayout.NORTH);

        textField.setText("Программа загадала число от 1 до 10");
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.CENTER);

        Font font = new Font("Arial", Font.PLAIN, 18);
        textField.setFont(font);

        textArea = new JTextArea();

        JPanel buttonsPanel = new JPanel(new GridLayout(1, 10));
        add(buttonsPanel, BorderLayout.CENTER);

        JPanel restartPanel = new JPanel();
        add(restartPanel, BorderLayout.SOUTH);
        textArea.setText("Попытка " + tryNumber + " из 3");
        restartPanel.add(textArea);

        for (int i = 1; i <= 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.setFont(font);
            buttonsPanel.add(button);
            int buttonIndex = i;
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    tryToAnswer(buttonIndex, button);
                    textArea.setText("Попытка " + tryNumber + " из 3");
                }
            });
        }

        JButton restartButton = new JButton("Перезапуск");
        restartPanel.add(restartButton);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("Игра началась!");
                new GuessNumber();
            }
        });

        setVisible(true);
    }

    public void tryToAnswer(int answer, JButton button) {

        if(tryNumber > 2){
            textField.setText("Попытки закончились! Вы проиграли. Загаданное число: " + randomNumber);
            return;
        }

        if(answer == randomNumber) {
            textField.setText("Вы угадали! Ответ: " + randomNumber);
            button.setBackground(Color.GREEN);
        } else if(answer > randomNumber) {
            textField.setText("Не угадали! Загаданное число меньше");
        } else {
            textField.setText("Не угадали! Загаданное число больше");
        }
        tryNumber += 1;
    }
}
