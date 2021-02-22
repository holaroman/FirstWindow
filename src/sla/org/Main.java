package sla.org;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;


public class Main  extends Application{

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("The Dawk Web");

            Button button = new Button("Shop now");

            Scene scene = new Scene(button, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();

            primaryStage.show();
        }

         public static void main(String[] args) {
            Application.launch(args);
     }

}

