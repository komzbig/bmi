package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.text.DecimalFormat;

import static java.lang.String.valueOf;

public class Controller {
    private static DecimalFormat df2 = new DecimalFormat(".##");

    @FXML
    private void handleButtonAction(ActionEvent event){
        double masa = Double.parseDouble(wagaTF.getText());

        double wzrostkwadrat = (Double.parseDouble(wzrostTF.getText()) * Double.parseDouble(wzrostTF.getText()))/10000;

        double wynik = (double)masa/wzrostkwadrat;
        String wyniktekst;
            if (wynik<16){
                Komunikat.setText("Wygłodzenie");
            }
            if ((wynik>16) && (wynik<16.99)) {
                Komunikat.setText("Wychudzenie");
            }
        if ((wynik>17) && (wynik<18.49)) {
            Komunikat.setText("Niedowaga");
        }
        if ((wynik>18.5) && (wynik<24.99)) {
            Komunikat.setText("Wartość prawidłowa");
        }
        if ((wynik>25) && (wynik<29.99)) {
            Komunikat.setText("Nadwaga");
        }
        if ((wynik>30) && (wynik<34.99)) {
            Komunikat.setText("I stopień otyłości");
        }
        if ((wynik>35) && (wynik<39.99)) {
            Komunikat.setText("II stopień otyłości (otyłość kliniczna)");
        }
        if (wynik>40)  {
            Komunikat.setText("III stopień otyłości (otyłość skrajna)");
        }


        label.setText("BMI " + valueOf(df2.format(wynik)));

        System.out.println("Zostałem kliknięty "+ wynik);
    }
    @FXML
    TextField wagaTF;

    @FXML
    TextField wzrostTF;

    @FXML
    Label label;

    @FXML
    Label Komunikat;

}
