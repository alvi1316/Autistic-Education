package autistic.edu;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


public class MenuFXMLController implements Initializable {

    AutisticEdu autiEdu;

    public void setAutiEdu(AutisticEdu autiEdu) {
        this.autiEdu = autiEdu;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
       
    }    

    @FXML
    private void alphabetOnAction(ActionEvent event) throws IOException {
        autiEdu.alphabetPage();
    }

    @FXML
    private void colorOnAction(ActionEvent event) throws IOException {
        autiEdu.colorPage();
    }

    @FXML
    private void imageOnAction(ActionEvent event) throws IOException {
        autiEdu.imagePage();
    }

    @FXML
    private void shapeOnAction(ActionEvent event) throws IOException {
        autiEdu.shapePage();
    }

    @FXML
    private void mathOnAction(ActionEvent event) throws IOException {
        autiEdu.mathPage();
    }
    
}
