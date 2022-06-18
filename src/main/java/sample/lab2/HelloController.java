package sample.lab2;

import java.util.*;
import static java.lang.System.out;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.control.TextFormatter;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloController {
    public Button btnM;
    public TextField txtLicznik;
    public TextField wynik;
    public Button licz;
    public TextField promLicznik;
    public Button pMinus;
    public Button pPlus;
    public Button pPlusWys;
    public Button pMinusWys;
    public TextField wysokoscLicznik;
    public Button pPlusGrub;
    public Button pMinusGrub;
    public TextField gruboscLicznik;
    public TextField wynikWaga;
    public TextField wynikCena;
    public TextField wynikObj;

    int clickCunter = 0;
    int txtClickCounter =0;

    int promienCount=0;
    int wysokoscCount=0;
    int gruboscCount=0;

    public void onHelloButtonClick(ActionEvent actionEvent) {

        System.out.println("Kliknięcie numer: " + ++clickCunter);
        txtLicznik.setText("Kliknięcie numer: " + ++txtClickCounter);
        if (clickCunter ==1)
            btnM.setText("jeszcze raz");
    }



    public void inWysokosc(InputMethodEvent inputMethodEvent) {
        int wyskosc;
        Scanner input = new Scanner(System.in);
        wyskosc = input.nextInt();
    }



    public void promienPlus(ActionEvent actionEvent) {
        promLicznik.setText("Wymiar > 0!");
        promLicznik.setText(" "+ ++promienCount);
        if (promienCount <= 0)
            promLicznik.setText("Wymiar > 0!");
    }

    public void promienMinus(ActionEvent actionEvent) {
        promLicznik.setText("Wymiar > 0!");
        promLicznik.setText(" " + --promienCount);
        if (promienCount <= 0)
            promLicznik.setText("Wymiar > 0!");

    }

    public int getPromienCount() {
        return promienCount;
    }


    public void wysokoscPlus(ActionEvent actionEvent) {
        wysokoscLicznik.setText("Wymiar > 0!");
        wysokoscLicznik.setText(" " + ++wysokoscCount);
        if (wysokoscCount <= 0)
            wysokoscLicznik.setText("Wymiar > 0!");
    }

    public void wysokoscMinus(ActionEvent actionEvent) {
        wysokoscLicznik.setText("Wymiar > 0!");
        wysokoscLicznik.setText(" " + --wysokoscCount);
        if (wysokoscCount <= 0)
            wysokoscLicznik.setText("Wymiar > 0!");
    }


    public void gruboscPlus(ActionEvent actionEvent) {
        gruboscLicznik.setText("Wymiar >0!");
        gruboscLicznik.setText(" " + ++gruboscCount);
        if (gruboscCount <=0)
            gruboscLicznik.setText("Wymiar >0!");
    }

    public void gruboscMinus(ActionEvent actionEvent) {
        gruboscLicznik.setText("Wymiar >0!");
        gruboscLicznik.setText(" " + --gruboscCount);
        if (gruboscCount <=0)
            gruboscLicznik.setText("Wymiar >0!");
    }

    //P=2π(R^2−r^2)+2πh(R+r)
    public void clickLicz(ActionEvent actionEvent) {
        wynik.setText(String.valueOf(2*3.1415*(gruboscCount*gruboscCount - promienCount* promienCount) + 2*3.1415*wysokoscCount*(gruboscCount + promienCount)));
        wynikObj.setText(String.valueOf(3.1415*wysokoscCount*(gruboscCount*gruboscCount - promienCount* promienCount)));
        //gestosc*objetosc
        // działa ok sprawdzone z https://calcoolator.pl/gestosc.html
        wynikWaga.setText(String.valueOf((7.75*3.1415*wysokoscCount*(gruboscCount*gruboscCount - promienCount* promienCount))/1000));
        //3,60 za kg
        wynikCena.setText(String.valueOf(3.60*(7.75*3.1415*wysokoscCount*(gruboscCount*gruboscCount - promienCount* promienCount))/1000));
    }

    // zadanie zrobiem tak gdyz nie umiałem zrobic inputów z tekstu w taki sposób aby były zdolne do przetworzenia
    // przeliczniki dla drugiej stali pominąłem gdyż robiłoby się to analogicznie jak to
    //choć ostatecznie program "działa" to sam nie jestem z niego zadowolony, ale chciałem się wykazać inwencją że można zrobić po prostu inaczej










//    public void wynik(){
//        wynik.setText("%d",promien+wysokosc);
//    }


//    public void onBtnAcrion(ActionEvent actionEvent){
//        System.out.println("Kliknięcie numer: " + ++clickCunter);
//    }


//    @FXML
//   private Label welcomeText;
//
//   @FXML
//        welcomeText.setText("Welcome to JavaFX Application!");

}