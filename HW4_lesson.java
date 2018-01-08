/**
 * Java. Level 2. Lesson 4. Homework
 *
 * @author Ivan Petrov
 * @version dated Jan 08, 2018
 * @link https://github.com/ljohnpetrov/Java
 */

import java.awt.*;
import java.awt.event.*;
import java.io.PrintWriter;
import javax.swing.*;
import javax.swing.text.*; // for StyledDocument
/**
 1. Создать окно для клиентской части чата: большое текстовое поле (JTextArea()) 
 * для отображения переписки в центре окна. Однострочное текстовое поле для ввода сообщений и 
 * кнопка для отсылки сообщений на нижней панели. 
 * Сообщение должно отсылаться либо по нажатию кнопки на форме, 
 * либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего поля в центральное.
 */
class HW4_lesson extends JFrame implements ActionListener{

    final String TITLE_OF_PROGRAM = "Spamer messeges";
    final int START_LOCATION = 200;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

    final String BTN_ENTER = "Enter";

    JTextArea textbox;
    JTextField message;

    public static void main(String[] args) {
        new Main();
    }
    HW4_lesson(){
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION, START_LOCATION, WINDOW_WIDTH, WINDOW_HEIGHT);
        textbox = new JTextArea();
        textbox.setEditable(false);
        JScrollPane scrollBar = new JScrollPane(textbox);
        message = new JTextField();
        message.addActionListener(this);
        JButton Enter = new JButton(BTN_ENTER);
        Enter.addActionListener(this);

        JPanel button = new JPanel();
        button.setLayout(new BoxLayout(button, BoxLayout.X_AXIS));
        button.add(message);
        button.add(Enter);

        add(BorderLayout.CENTER, scrollBar);
        add(BorderLayout.SOUTH, button);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (message.getText().trim().length() > 0) {
            try {
                textbox.append(message.getText() + "\n");
            } catch(Exception e) { }
        }
        message.setText("");
        message.requestFocusInWindow();
    }
}
