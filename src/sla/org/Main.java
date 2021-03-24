package sla.org;

import javafx.application.Application;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;



public class Main  extends Application{

        ImageView imagesView;

        Image image2;
        Image image3;
        Image image4;
        Image image5;

        Button button1;
        Button button2;
        Button button3;
        Button button4;

        @Override
        public void start(Stage primaryStage) throws Exception {
            primaryStage.setTitle("The Dawk Web");

            FileInputStream input1 = new FileInputStream("/Users/aidanroman/Desktop/Black Market.png");
            Image image = new Image(input1);

            FileInputStream input2 = new FileInputStream("/Users/aidanroman/Desktop/Classified.jpeg");
            image2 = new Image(input2);

            FileInputStream input3 = new FileInputStream("/Users/aidanroman/Desktop/images.jpeg");
            image3 = new Image(input3);

            FileInputStream input4 = new FileInputStream("/Users/aidanroman/Desktop/images-1.jpeg");
            image4 = new Image(input4);


            FileInputStream input5 = new FileInputStream("/Users/aidanroman/Desktop/images-2.jpeg");
            image5 = new Image(input5);

            imagesView = new ImageView(image);

            button1 = new Button("Classified Document");
            button2 = new Button("Walt Disney's arm");
            button3 = new Button("Crown jewels");
            button4 = new Button("An old dude");


           button1.setOnAction(actionEvent -> {
                choiceboxUsed();
            });

            button2.setOnAction(actionEvent -> {
                secondbuttonUsed();
            });

            button3.setOnAction(actionEvent -> {
                thirdbuttonUsed();
            });

            button4.setOnAction(actionEvent -> {
                fourthbuttonUsed();
            });


            VBox layout = new VBox(imagesView,button1,button2,button3,button4);
            Scene scene = new Scene(layout, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();



            primaryStage.show();
        }

        void choiceboxUsed(){
    String Choice = button1.getId();
            imagesView.setImage(image2);
        }

    void secondbuttonUsed(){
        String Choice = button2.getId();
        imagesView.setImage(image3);

    }

    void thirdbuttonUsed(){
        String Choice = button3.getId();
        imagesView.setImage(image4);

    }

    void fourthbuttonUsed(){
        String Choice = button4.getId();
        imagesView.setImage(image5);

    }










         public static void main(String[] args) {
            Application.launch(args);
     }

}

