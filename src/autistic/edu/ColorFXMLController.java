
package autistic.edu;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;


public class ColorFXMLController implements Initializable {

    @FXML
    private Text question;
    @FXML
    private Text answer;
    
    String ans="0";
    
    String[] colors = {"Red","Orange","Yellow","Green","Blue","Purple","Pink","Brown","Grey","Black","White"};

    AutisticEdu autiEdu;
    

    public void setAutiEdu(AutisticEdu autiEdu) {
        this.autiEdu = autiEdu;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int idx = new Random().nextInt(colors.length);
        String random = (colors[idx]);
        question.setText(random);
        
    }    

    @FXML
    private void colorAction(ActionEvent event) {
        ans = ((Button)event.getSource()).getText();
        ((Button)event.getSource()).setStyle(((Button)event.getSource()).getStyle()+"-fx-border-color: black;");
    }

    @FXML
    private void pronounceAction(ActionEvent event) {
        Media hit = new Media(new File("audio/"+question.getText()+".mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    @FXML
    private void submitAction(ActionEvent event) {
        if(ans.equals(question.getText())){
            answer.setText("The answer is Correct");
        }else{
            answer.setText("The answer is Incorrect");
        }
    }

    @FXML
    private void againAction(ActionEvent event) throws IOException {
        autiEdu.colorPage();
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        autiEdu.startPage();
    }
    
}
