package lessons.lesson5_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainFXWindow extends Application {

    private static final int WIDTH = 500;
    private static final int HEIGHT = 500;

    public static void main(String[] args) {
        launch(args);
    }

    void windowSetup(Stage primaryStage) {
        primaryStage.setWidth(WIDTH);
        primaryStage.setHeight(HEIGHT);

        primaryStage.setMaxHeight(WIDTH);
        primaryStage.setMaxWidth(HEIGHT);

        primaryStage.setMinHeight(WIDTH);
        primaryStage.setMinWidth(HEIGHT);
    }

    void uiSetup(Pane root) {
        // Text -----------------------------------------------
        // ----------------------------------------------------
        Text text = new Text("hello world");
        text.setTranslateX(10);
        text.setTranslateY(10);
        Font font = new Font(24);
        text.setFont(font);

        // TextField ------------------------------------------
        // ----------------------------------------------------
        TextField textField = new TextField("100");
        textField.setTranslateX(230);
        textField.setTranslateY(10);

        // Button ---------------------------------------------
        // ----------------------------------------------------
        Button button = new Button("Добавить число");
        button.setTranslateX(100);
        button.setTranslateY(10);
        button.setOnMouseClicked((event) -> { // лямбда (lambda)
            String number = textField.getText();
            String oldText = text.getText();
            text.setText(oldText + "\n" + number);
        });
        button.setOnKeyPressed((event) -> {
            if (event.getCode() == KeyCode.W) {
                System.out.println("W pressed");
            }
        });

        root.getChildren().addAll(text, button, textField);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        windowSetup(primaryStage);

        Pane root = new Pane();
        uiSetup(root);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
