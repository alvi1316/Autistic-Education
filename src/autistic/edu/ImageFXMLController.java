
package autistic.edu;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

public class ImageFXMLController implements Initializable {

    @FXML
    private Text question;
    @FXML
    private Text answer;

    String[] images = {"bird","cat","dog","elephant","giraffe","lion","monkey","ox","rhino"};
    
    String ans;

    AutisticEdu autiEdu;

    public void setAutiEdu(AutisticEdu autiEdu) {
        this.autiEdu = autiEdu;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int idx = new Random().nextInt(images.length);
        String random = (images[idx]);
        question.setText(random);
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
        autiEdu.imagePage();
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        autiEdu.startPage();
    }

    @FXML
    private void birdAction(MouseEvent event) {
        ans = "bird";
    }

    @FXML
    private void catAction(MouseEvent event) {
        ans = "cat";
    }

    @FXML
    private void dogAction(MouseEvent event) {
        ans = "dog";
    }

    @FXML
    private void elephantAction(MouseEvent event) {
        ans = "elephant";
    }

    @FXML
    private void giraffeAction(MouseEvent event) {
        ans = "giraffe";
    }

    @FXML
    private void lionAction(MouseEvent event) {
        ans = "lion";
    }

    @FXML
    private void monkeyAction(MouseEvent event) {
        ans = "monkey";
    }

    @FXML
    private void oxAction(MouseEvent event) {
        ans = "ox";
    }

    @FXML
    private void rhinoAction(MouseEvent event) {
        ans = "rhino";
    }
    
}
