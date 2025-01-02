package MagicalEightBall;


//from javaFX library
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


//shows the eightball, GUI part of the code
public class MainStart extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane borderPane = new BorderPane(); //border pane layout

        //instance of magic eight ball
        MagicEightBall magicEightBall = new MagicEightBall();
        
        //button so the user can interact with the eightball
        Button button = new Button("Ask the Magic 8 Ball");
        button.setOnAction(e -> magicEightBall.showSaying());

        //adding the eight ball to the center of the border pane
        borderPane.setCenter(magicEightBall);
        
        //adding a button at the bottom of the magic eightball
        borderPane.setBottom(button);
        BorderPane.setAlignment(button, javafx.geometry.Pos.CENTER); //button in the bottom center

        //creating a size for the border pane
        Scene scene = new Scene(borderPane, 300, 400);
        primaryStage.setTitle("Magic Eight Ball"); //title of the window
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //main method to launch the javaFX file
    public static void main(String[] args) {
        launch(args); //launching the javaFX file (GUI?)
    }
}


