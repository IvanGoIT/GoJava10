package questions.question8_1;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ImageExample extends Application {

    private static final String[] IMAGE_URLS = new String[] {
            "https://media.istockphoto.com/photos/two-red-balloons-picture-id505640210?k=6&m=505640210&s=612x612&w=0&h=cr76FHFVLlU1y-artTN3-T77P1XzTwbfou2zjLlZxms=",
            "http://i.telegraph.co.uk/multimedia/archive/03597/POTD_chick_3597497k.jpg",
            "http://i.telegraph.co.uk/multimedia/archive/03519/potd-squirrel_3519920k.jpg",
            "https://media.gettyimages.com/photos/colorful-powder-explosion-picture-id550582551"
    };

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(10);

        Pane root = new Pane();
        Button btnShow = new Button("Show");
        root.getChildren().addAll(btnShow);
        btnShow.setOnAction((event) -> {
            for(int i = 0; i < IMAGE_URLS.length; i++) {
                final int index = i;
                service.submit(() -> {
                    Image image = new Image(IMAGE_URLS[index]);
                    ImageView imageView = new ImageView(image);
                    Platform.runLater(() -> {
                        imageView.setTranslateX(index * 300);
                        imageView.setFitWidth(290);
                        imageView.setPreserveRatio(true);
                        root.getChildren().addAll(imageView);
                    });
                });
            }
        });

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
