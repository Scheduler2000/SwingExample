package Calculator.Views;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalcView extends JFrame {

    private static final long serialVersionUID = 1957887141985214957L;
    private final JTextField _firstNumberField;
    private final JTextField _secondNumberField;
    private final JTextField _calcSolutionField;
    private final JLabel _additionLabel;
    private final JButton _additionButton;

    public int getFirstNumber() throws NumberFormatException {
        return Integer.parseInt(_firstNumberField.getText());
    }

    public int getSecondNumber() throws NumberFormatException {
        return Integer.parseInt(_secondNumberField.getText());
    }

    public void setCalcSolution(int result) {
        _calcSolutionField.setText(String.format("%s", result));
    }

    public CalcView() {

        this._firstNumberField = new JTextField("first number ...");
        this._secondNumberField = new JTextField("second number ...");
        this._calcSolutionField = new JTextField("result ...");

        this._additionLabel = new JLabel("+");
        this._additionButton = new JButton("Calculate");

        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(new Dimension(600, 200));

        var panel = new JPanel();
        panel.add(_firstNumberField);
        panel.add(_additionLabel);
        panel.add(_secondNumberField);
        panel.add(_calcSolutionField);
        panel.add(_additionButton);
        super.add(panel);

        super.setVisible(true);
    }

    public void OnPressedButton(ActionListener listener) {
        _additionButton.addActionListener(listener);
    }
}
