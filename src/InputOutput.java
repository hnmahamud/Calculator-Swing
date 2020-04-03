import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputOutput extends JFrame implements ActionListener {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 200;
    private ButtonPanel buttonPanel;
    private TextPanel textPanel;

    public InputOutput() {
        setTitle("Adding Machine");
        setSize(WIDTH, HEIGHT);
        Container contentPane = this.getContentPane();
        //contentPane.setLayout(new BorderLayout);

        buttonPanel = new ButtonPanel(this);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);

        textPanel = new TextPanel();
        contentPane.add(textPanel, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Add")) {
            String input1 = textPanel.getInputField1();
            String input2 = textPanel.getInputField2();
            int int1 = Integer.parseInt(input1);
            int int2 = Integer.parseInt(input2);
            int int3 = int1 + int2;
            String input3 = String.valueOf(int3);
            textPanel.setOutputField(input3);
        } else if (e.getActionCommand().equals("Mul")) {
            String input1 = textPanel.getInputField1();
            String input2 = textPanel.getInputField2();
            int int1 = Integer.parseInt(input1);
            int int2 = Integer.parseInt(input2);
            int int3 = int1 * int2;
            String input3 = String.valueOf(int3);
            textPanel.setOutputField(input3);
        } else if (e.getActionCommand().equals("Reset")) {
            textPanel.setInputField1("");
            textPanel.setInputField2("");
            textPanel.setOutputField("");
        }
    }

    public static void main(String[] args) {
        InputOutput guiAdder = new InputOutput();
        guiAdder.setVisible(true);
    }

}
