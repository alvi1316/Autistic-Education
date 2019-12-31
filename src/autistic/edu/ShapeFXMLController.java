
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


public class ShapeFXMLController implements Initializable {

    @FXML
    private Text question;
    @FXML
    private Text answer;
    
    String[] shapes = {"circle","heart","hexagon","octagon","oval","rectangle","square","star","triangle"};
    
    String ans="0";
    
    AutisticEdu autiEdu;
    

    public void setAutiEdu(AutisticEdu autiEdu) {
        this.autiEdu = autiEdu;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        int idx = new Random().nextInt(shapes.length);
        String random = (shapes[idx]);
        question.setText(random);
        
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
        autiEdu.shapePage();
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        autiEdu.startPage();
    }

    @FXML
    private void pronounceAction(ActionEvent event) {
        Media hit = new Media(new File("audio/"+question.getText()+".mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(hit);
        mediaPlayer.play();
    }

    @FXML
    private void circleAction(MouseEvent event) {
        ans = "circle";
    }

    @FXML
    private void heartAction(MouseEvent event) {
        ans = "heart";
    }

    @FXML
    private void hexagonAction(MouseEvent event) {
        ans = "hexagon";
    }

    @FXML
    private void octagonAction(MouseEvent event) {
        ans = "circle";
    }

    @FXML
    private void ovalAction(MouseEvent event) {
        ans = "oval";
    }

    @FXML
    private void ractangleAction(MouseEvent event) {
        ans = "ractangle";
    }

    @FXML
    private void squareAction(MouseEvent event) {
        ans = "square";
    }

    @FXML
    private void starAction(MouseEvent event) {
        ans = "star";
    }

    @FXML
    private void triangleAction(MouseEvent event) {
        ans = "triangle";
    }
    
}
