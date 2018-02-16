package questions.question9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JavaFXExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        TextArea textArea = new TextArea("Bla-bla-bla-bla-bla");
        Insets padding = new Insets(10, 50, 10, 50);
        textArea.setPadding(padding);

        Button btnClick = new Button("Click me");
        btnClick.setPadding(padding);

        root.getChildren().addAll(textArea, btnClick);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
