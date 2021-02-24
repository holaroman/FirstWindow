package sla.org;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;


public class Main  extends Application{

        void clicked (){

            System.out.println("I've been clicked");
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("The Dawk Web");

            Button button = new Button("Shop now");
            button.setOnAction(actionEvent -> {
                clicked();

            });

            FileInputStream input = new FileInputStream("/Users/aidanroman/Desktop/youtube2.jpeg");
            Image image = new Image(input);
            ImageView imageView = new ImageView(image);

            VBox layout = new VBox(button,imageView);
            Scene scene = new Scene(layout, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();



            primaryStage.show();
        }

         public static void main(String[] args) {
            Application.launch(args);
     }

}

