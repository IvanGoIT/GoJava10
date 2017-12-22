package questions.question5_2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {
    private static final int HEIGHT = 300;
    private static final int WIDTH = 400;

    @Override
    public void start(Stage primaryStage)
    {
        //Add a scene
        Group root = new Group();
        Scene scene = new Scene(root, WIDTH, HEIGHT);

        String path = "files/question5_2/put.mp3";
        Media pick = new Media(new File(path).toURI().toString());
        MediaPlayer player = new MediaPlayer(pick);
        player.play();

        //Add a mediaView, to display the media. Its necessary !
        //This mediaView is added to a Pane
        MediaView mediaView = new MediaView(player);
        ((Group)scene.getRoot()).getChildren().add(mediaView);

        //show the stage
        primaryStage.setTitle("Media Player");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}