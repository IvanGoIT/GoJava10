package questions.question5_2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lessons.lesson5_1.PaintFX;

public class JavaFXClearExample extends Application {
    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Text label = new Text("bla-bla-bla-bla-bla");
        label.setTranslateX(10);
        label.setTranslateY(10);
        root.getChildren().add(label);

        Pane paneCircles = new Pane();
        root.getChildren().add(paneCircles);

        PaintFX.drawUI(root, paneCircles);
        PaintFX.draw(paneCircles);

        primaryStage.setScene(new Scene(root, WIDTH, HEIGHT));
        primaryStage.show();
    }
}
