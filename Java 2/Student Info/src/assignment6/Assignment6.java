/*
 * Karn Bhavsar
 * Student ID: 991578281
 * PROG24178 - Object Oriented Programming 2 - JAVA
*/

package assignment6;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 *
 * @author karnb
 */
public class Assignment6 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLassignment6.fxml"));
        stage.setTitle("Course Information");
        stage.setScene(new Scene(root));
        stage.show();
    }   
    
}
