package questions.question8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class FXWindow extends Application {

    private void initWindow(Pane root) {
        TextField input = new TextField("10");
        input.setTranslateX(10);
        input.setTranslateY(10);

        Button launch = new Button("Launch");
        launch.setTranslateX(200);
        launch.setTranslateY(100);

        TextArea output = new TextArea("Result: ");
        output.setTranslateX(10);
        output.setTranslateY(80);

        root.getChildren().addAll(input, launch, output);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        initWindow(root);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
