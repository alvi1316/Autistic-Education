package autistic.edu;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class AutisticEdu extends Application {
    
    Stage stage;
    
    @Override
    public void start(Stage primaryStage){
        stage=primaryStage;
        try {
            startPage();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void startPage() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MenuFXML.fxml"));
        Parent root = loader.load();
        MenuFXMLController controller = loader.getController();
        controller.setAutiEdu(this);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
        
    }
    
    public void alphabetPage()throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("AlphabetFXML.fxml"));
        Parent root = loader.load();
        AlphabetFXMLController controller = loader.getController();
        controller.setAutiEdu(this);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    
    public void colorPage()throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ColorFXML.fxml"));
        Parent root = loader.load();
        ColorFXMLController controller = loader.getController();
        controller.setAutiEdu(this);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

    public void shapePage()throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ShapeFXML.fxml"));
        Parent root = loader.load();
        ShapeFXMLController controller = loader.getController();
        controller.setAutiEdu(this);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    
    public void mathPage()throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("MathFXML.fxml"));
        Parent root = loader.load();
        MathFXMLController controller = loader.getController();
        controller.setAutiEdu(this);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    
    public void imagePage()throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ImageFXML.fxml"));
        Parent root = loader.load();
        ImageFXMLController controller = loader.getController();
        controller.setAutiEdu(this);
        stage.setScene(new Scene(root));
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
