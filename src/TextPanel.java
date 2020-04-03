import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextPanel extends JPanel {
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField outputField;
    
    public TextPanel() {
        this.setBackground(Color.blue);
        this.setLayout(new FlowLayout());
        inputField1 = new JTextField(30);
        inputField2 = new JTextField(30);
        outputField = new JTextField(30);
        this.add(inputField1);
        this.add(inputField2);
        this.add(outputField);
    }

    public String getInputField1() { return inputField1.getText(); }

    public String getInputField2() {
        return inputField2.getText();
    }

    public void setInputField1(String string) {
        inputField1.setText(string);
    }

    public void setInputField2(String string) {
        inputField2.setText(string);
    }
    
    public void setOutputField(String string) {
        outputField.setText(string);
    }
    
}
