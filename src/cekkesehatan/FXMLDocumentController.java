/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private RadioButton lk;
    @FXML
    private ToggleGroup pilihan;
    @FXML
    private RadioButton pr;
    @FXML
    private TextField nm;
    @FXML
    private TextField bb;
    @FXML
    private TextField tb;
    @FXML
    private TextArea hasil;
    @FXML
    private TextArea saran;
    @FXML
    private Button proses;
    @FXML
    private Button reset;
    @FXML
    private TextArea ideal;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    void buttonProses(ActionEvent event) {
        String kelamin;
        int Ideal=0;
        int Bb =Integer.parseInt(bb.getText());
        int Tb =Integer.parseInt(tb.getText());
        if(lk.isSelected()){
        Ideal= Tb - 100;
        ideal.setText(""+Ideal);
        }
        else if(pr.isSelected()){
        Ideal= Tb - 110;
        ideal.setText(""+Ideal);
        }
        String Nama=nm.getText();
        String Berat=bb.getText()+ " KG";
        String Tinggi=tb.getText();
        if(Bb>Ideal){
        saran.setText("Kamu Lemu");
        }else if(Bb<Ideal){
        saran.setText("Kamu Kurus");
        }else if(Bb==Ideal){
        saran.setText("Kamu Ideal! ");
        }
        
        if(lk.isSelected())
        kelamin = "Laki - Laki";
        else if (pr.isSelected())
        kelamin = "Perempuan";
        else
        kelamin=" ";
        
        hasil.setText("Nama : " +Nama+"\n"+"Berat Badan : " +Berat+"\n"+"Tinggi Badan : " +Tinggi+"\nJenis Kelamin : "+kelamin);              
    }

    @FXML
    void buttonReset(ActionEvent event) {
        nm.setText("");
        bb.setText("");
        tb.setText("");
        lk.setSelected(false);
        pr.setSelected(false);
        hasil.setText("");
        saran.setText("");
        ideal.setText("");
    }
    
}
