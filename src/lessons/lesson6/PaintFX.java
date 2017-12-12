package lessons.lesson6;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.Random;

public class PaintFX extends Application {
    private static final int WINDOW_WIDTH = 1000;
    private static final int WINDOW_HEIGHT = 700;

    private static final int RGB_SYMBOLS_COUNT = 6;
    private static final int COUNT_OF_CIRCLES = 100;

    private Random r = new Random();

    public static void main(String[] args) {
        launch(args);
    }

    private Paint generateRandomColor() {
        String rgb = "#";
        for(int i = 0; i < RGB_SYMBOLS_COUNT; i++) {
            rgb += (char)('0' + r.nextInt(9));
        }
        System.out.println(rgb);
        return Paint.valueOf(rgb);
    }

    private Circle generateCircle(int maxRadius, int maxStroke) {
        Circle c = new Circle(r.nextDouble() * WINDOW_WIDTH,
                r.nextDouble() * WINDOW_HEIGHT,
                r.nextDouble() * maxRadius);

        c.setStrokeWidth(r.nextDouble() * maxStroke);
        c.setStroke(generateRandomColor());
        c.setFill(Paint.valueOf("#00000000"));

        return c;
    }

    private void draw(Pane root) {
        for(int i = 0; i < COUNT_OF_CIRCLES; i++) {
            Circle circle = generateCircle(100, 10);
            root.getChildren().addAll(circle);
        }
    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WINDOW_WIDTH);
        primaryStage.setHeight(WINDOW_HEIGHT);

        primaryStage.setMaxWidth(WINDOW_WIDTH);
        primaryStage.setMaxHeight(WINDOW_HEIGHT);

        primaryStage.setMinWidth(WINDOW_WIDTH);
        primaryStage.setMinHeight(WINDOW_HEIGHT);
    }

    void drawUI(Pane root, Pane circlesRoot) {
        Button button = new Button("Regenerate");
        button.setTranslateX(10);
        button.setTranslateY(10);
        button.setOnAction((event) -> {
            circlesRoot.getChildren().clear();
            draw(circlesRoot);
        });
        root.getChildren().addAll(button);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Pane circlesRoot = new Pane();
        root.getChildren().addAll(circlesRoot);

        drawUI(root, circlesRoot);
        draw(circlesRoot);


        windowSetup(primaryStage);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
