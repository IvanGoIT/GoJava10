package questions.question9;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

import java.io.File;

import java.net.URL;

public class VideoPlayerExample extends Application {

    private static final String VIDEO_URL =
            "files/question9/videoplayback.mp4";


    private static final String AUDIO_URL =
            "files/question9/Bastille - Bad Blood.mp3";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();

        Media media = new Media(new File(VIDEO_URL).toURI().toString());
        MediaPlayer player = new MediaPlayer(media);

        MediaView mediaView = new MediaView(player);

        Button btnPlay = new Button("Play");
        btnPlay.setOnAction((event -> {
            if (player.getStatus() == MediaPlayer.Status.PLAYING) {
                player.pause();
                btnPlay.setText("Play");
            } else {
                player.play();
                btnPlay.setText("Pause");
            }
        }));

        root.getChildren().addAll(mediaView, btnPlay);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
