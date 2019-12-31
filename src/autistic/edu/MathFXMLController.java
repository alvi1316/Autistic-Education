
package autistic.edu;

import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class MathFXMLController implements Initializable {

    @FXML
    private Text one;
    @FXML
    private Text two;
    @FXML
    private TextField inputOne;
    @FXML
    private Text three;
    @FXML
    private Text four;
    @FXML
    private TextField inputTwo;
    @FXML
    private Text five;
    @FXML
    private Text six;
    @FXML
    private TextField inputThree;
    @FXML
    private Text seven;
    @FXML
    private Text eight;
    @FXML
    private TextField inputFour;
    @FXML
    private Text result;
    
    String result1,result2,result3,result4;
    int temp1,temp2;
    
    AutisticEdu autiEdu;

    public void setAutiEdu(AutisticEdu autiEdu) {
        this.autiEdu = autiEdu;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Random r = new Random();
        temp1=r.nextInt(100);
        one.setText(Integer.toString(temp1));
        temp2=r.nextInt(100);
        two.setText(Integer.toString(temp2));
        result1=Integer.toString(temp1+temp2);
        
        temp1=r.nextInt(100);
        three.setText(Integer.toString(temp1));
        temp2=r.nextInt(100);
        four.setText(Integer.toString(temp2));
        result2=Integer.toString(temp1-temp2);
        
        temp1=r.nextInt(100);
        five.setText(Integer.toString(temp1));
        temp2=r.nextInt(100);
        six.setText(Integer.toString(temp2));
        result3=Integer.toString(temp1*temp2);
        
        temp1=r.nextInt(100);
        seven.setText(Integer.toString(temp1));
        temp2=r.nextInt(100);
        eight.setText(Integer.toString(temp2));
        result4=Integer.toString(temp1/temp2);
        
        
    }    

    @FXML
    private void submitAction(ActionEvent event) {
        if(result1.equals(inputOne.getText())&&result2.equals(inputTwo.getText())&&result3.equals(inputThree.getText())&&result4.equals(inputFour.getText())){
            result.setText("The answer is correct");
        }else{
            result.setText("The answer is Incorrect");
        }
    }

    @FXML
    private void againAction(ActionEvent event) throws IOException {
        autiEdu.mathPage();
    }

    @FXML
    private void backAction(ActionEvent event) throws IOException {
        autiEdu.startPage();
    }
    
}
