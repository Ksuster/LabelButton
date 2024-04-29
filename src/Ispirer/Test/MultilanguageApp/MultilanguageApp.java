package Ispirer.Test.MultilanguageApp;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MultilanguageApp extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;
    private JMenuBar menuBar;
    private JMenu languageMenu;
    private JMenuItem englishItem;
    private JMenuItem russianItem;

    public MultilanguageApp() {
        setTitle("Multilingual App");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Привет");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        button = new JButton("Нажми меня");
        button.addActionListener(this);

        menuBar = new JMenuBar();
        languageMenu = new JMenu("Язык");

        englishItem = new JMenuItem("Английский");
        englishItem.addActionListener(this);

        russianItem = new JMenuItem("Русский");
        russianItem.addActionListener(this);

        languageMenu.add(englishItem);
        languageMenu.add(russianItem);
        menuBar.add(languageMenu);

        setJMenuBar(menuBar);

        setLayout(new BorderLayout());
        add(label, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(this, "Кнопка нажата");
        } else if (e.getSource() == englishItem) {
            label.setText("Hello");
            button.setText("Click Me");
        } else if (e.getSource() == russianItem) {
            label.setText("Привет");
            button.setText("Нажми меня");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MultilanguageApp app = new MultilanguageApp();
            app.setVisible(true);
        });
    }
}
