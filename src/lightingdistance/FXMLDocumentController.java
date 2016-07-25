/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lightingdistance;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 *
 * @author Kuba
 */
public class FXMLDocumentController implements Initializable {
    
    private final StopWatch stoper = new StopWatch("Time");
    
    private Boolean counting = false;
    
    double distance;
    
    @FXML
    private Label label;
    @FXML
    private Label label1;
    @FXML
    
    
    
    private void handleButtonAction(ActionEvent event) {
        if (counting==false) {
            stoper.start();
        System.out.println("You clicked me!");
          
        counting = true;
              
        }else if(counting == true){
              stoper.stop();
        System.out.println(stoper);
         label.setText(stoper.toString());
         counting = false;
         
         distance = stoper.takeScore()/3;
         label1.setText( new DecimalFormat("##.##").format(distance)+" km");
         
        }
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
