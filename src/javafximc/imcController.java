package javafximc;

import fr.m2i.imc.model.ImcCalculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author nico
 */
public class imcController {

    @FXML
    TextField kg;

    @FXML
    TextField m;

    @FXML
    Label IMC;

    public void onCalcul(ActionEvent event) {

        //Test
        IMC.setText(kg.getText());
        //test ok

        //Récupération et conversion de la saisie de l'utilisateur
        double kgEnChiffre = Double.valueOf(kg.getText());
        double mEnMetres = Double.valueOf(m.getText());

        //Instanciation de l'ImcCalculator
        ImcCalculator imcCalculator = new ImcCalculator(kgEnChiffre, mEnMetres);

        IMC.setText("Votre IMC est de : " + imcCalculator.getImc() + " \n" + imcCalculator.traduireIMC());
        kg.setText("");
        m.setText("");
    }
}
