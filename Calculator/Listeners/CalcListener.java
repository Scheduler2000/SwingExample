package Calculator.Listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Calculator.Controllers.CalcController;

public class CalcListener implements ActionListener {
    private CalcController _controller;

    public CalcListener(CalcController controller) {
        this._controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        _controller.Calculate();

    }

}
