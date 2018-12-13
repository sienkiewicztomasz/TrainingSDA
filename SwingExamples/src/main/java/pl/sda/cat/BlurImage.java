package pl.sda.cat;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.*;
import javafx.scene.effect.*;
import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;

public class BlurImage extends Application {

    // launch the application
    public void start(Stage stage) throws Exception
    {

        // set title for the stage
        stage.setTitle("MotionBlur Example");

        // create a input stream
        FileInputStream input = new FileInputStream("D:\\TrainingSDA\\SwingExamples\\cat2.jpg");

        // create a image
        Image image = new Image(input);

        // create a image View
        ImageView imageview = new ImageView(image);

        // create a Motion blur effect
        MotionBlur motion_blur = new MotionBlur();

        // set Radius
        motion_blur.setRadius(25.0f);

        // set angle
        motion_blur.setAngle(400.0f);

        // set effect
        imageview.setEffect(motion_blur);

        // create a VBox
        VBox vbox = new VBox(imageview);

        // create a scene
        Scene scene = new Scene(vbox, 500, 500);

        // set the scene
        stage.setScene(scene);

        stage.show();
    }

    // Main Method
    public static void main(String args[])
    {

        // launch the application
        launch(args);
    }
}
