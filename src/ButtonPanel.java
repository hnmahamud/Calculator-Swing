import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel {
    private JButton addButton;
    private JButton mulButton;
    private JButton resetButton;

    public ButtonPanel(InputOutput inputOutput) {
        setBackground(Color.gray);
        addButton = new JButton("Add");
        mulButton = new JButton("Mul");
        resetButton = new JButton("Reset");
        addButton.addActionListener(inputOutput);
        mulButton.addActionListener(inputOutput);
        resetButton.addActionListener(inputOutput);
        this.add(addButton);
        this.add(mulButton);
        this.add(resetButton);
    }
    
}
