
package autistic.edu;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class AlphabetFXMLController implements Initializable {

    @FXML
    private Text alphabet;
    @FXML
    private Text answer;
    
    String question;
    String ans = "0";

    AutisticEdu autiEdu;

    public void setAutiEdu(AutisticEdu autiEdu) {
        this.autiEdu = autiEdu;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random r = new Random();
        char c = (char)(r.nextInt(26) + 'A');
        alphabet.setText(Character.toString(c));
        question = Character.toString(c);
    }    

    @FXML
    private void selectAlphabetAction(ActionEvent event) {
        ans = ((Button)event.getSource()).getText();
    }

    @FXML
    private void pronounceAction(ActionEvent event) {
        Media hit = new Media(new File("audio/"+question+".mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    @FXML
    private void submitAction(ActionEvent event) {
        if(ans.equals(question)){
            answer.setText("The answer is Correct");
        }else{
            answer.setText("The answer is Incorrect");
        }
    }

    @FXML
    private void againAction(ActionEvent event) throws IOException {
        autiEdu.alphabetPage();
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        autiEdu.startPage();
    }
    
}
