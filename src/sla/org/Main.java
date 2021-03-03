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
import javafx.scene.control.ChoiceBox;


public class Main  extends Application{

        void clicked (){


        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("The Dawk Web");

            FileInputStream input1 = new FileInputStream("/Users/aidanroman/Desktop/Black Market.png");
            Image image = new Image(input1);


            FileInputStream input2 = new FileInputStream("/Users/aidanroman/Desktop/Classified.jpeg");
            Image image2 = new Image(input2);

            FileInputStream input3 = new FileInputStream("/Users/aidanroman/Desktop/images.jpeg");
            Image image3 = new Image(input3);

            FileInputStream input4 = new FileInputStream("/Users/aidanroman/Desktop/images-1.jpeg");
            Image image4 = new Image(input4);


            FileInputStream input5 = new FileInputStream("/Users/aidanroman/Desktop/images-2.jpeg");
            Image image5 = new Image(input5);

            ImageView imageView = new ImageView(image);

            ChoiceBox choiceBox = new ChoiceBox();

            choiceBox.getItems().add("Classified documents");
            choiceBox.getItems().add("Walt Disney's arm");
            choiceBox.getItems().add("Prized jewels");
            choiceBox.getItems().add("dave");

        ;

            VBox layout = new VBox(imageView,choiceBox);
            Scene scene = new Scene(layout, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();



            primaryStage.show();
        }

         public static void main(String[] args) {
            Application.launch(args);
     }

}

