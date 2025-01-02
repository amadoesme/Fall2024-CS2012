package MagicalEightBall;

/** this class shows an actual eightball using javaFX.
 * It shows a random saying. for this class i did get help/guidance
 * from the Liang book and my friends in ASME
 */

//javaFX library
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;

public class MagicEightBall extends StackPane {
    private final Label label; //shows the magic eightball response
    private final WiseSayings wiseSayings; //instance of WiseSayings to get random responses

    //constructor that helps with making the circle, triangle and label
    public MagicEightBall() {
        wiseSayings = new WiseSayings();
        label = new Label("");
        label.setTextFill(Color.WHITE);
        label.setFont(new Font("Arial", 16));

        //circle surrounding the triangle
        Circle circle = new Circle(100);
        circle.setFill(Color.BLACK);
        circle.setStroke(Color.BLUE);

        //triangle pointing down
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
            0.0, -60.0,   //top vertex
            52.0, 30.0,   //bottom right vertex
            -52.0, 30.0   //bottom left vertex
        );
        triangle.setFill(Color.DARKBLUE);

        //adding the cirlce, triangle and label to StackPane
        getChildren().addAll(circle, triangle, label);
        setStyle("-fx-background-color: black; -fx-alignment: center;");
    }

    //shows mystery and changes the text to color gray
    public void showMystery() {
        label.setText("...");
        label.setTextFill(Color.GRAY);
    }

    //shows a random saying from the WiseSayings list (other class)
    public void showSaying() {
        label.setText(wiseSayings.getRandomSaying());
        label.setTextFill(Color.WHITE);
    }
}

