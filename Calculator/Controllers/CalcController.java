package Calculator.Controllers;

import javax.swing.JOptionPane;

import Calculator.Listeners.CalcListener;
import Calculator.Models.CalcModel;
import Calculator.Views.CalcView;

public class CalcController {
    private final CalcView _view;
    private final CalcModel _model;

    public CalcController(CalcView view, CalcModel model) {
        this._view = view;
        this._model = model;
        this._view.OnPressedButton(new CalcListener(this));
    }

    public void Calculate() {
        try {

            int firstNum = _view.getFirstNumber();
            int secondNum = _view.getSecondNumber();

            _view.setCalcSolution(_model.AddTwoNumbers(firstNum, secondNum));

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(_view, "You need to enter 2 integers.");
        }

    }

}
