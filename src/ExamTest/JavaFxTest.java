package ExamTest;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/**
 * @author XIN
 * @create 2022-11-07 21:35
 */
public class JavaFxTest extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Hello");
        Group root = new Group();
        Scene scene = new Scene(root, 300, 300);
        stage.setScene(scene);

        Text hi = new Text("Hello World!");
        hi.setFont(Font.font("Tahoma", FontWeight.NORMAL, 40));
        hi.setFill(Color.RED);

        hi.setOpacity(1.0);
        stage.setOpacity(.25);

        root.getChildren().add(hi);
        stage.show();
    }
}
