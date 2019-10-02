package test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import rx.controls.RXAvatar;
import rx.enums.ShapeType;

public class TestAvatar extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        BorderPane root = new BorderPane();
        RXAvatar avatar = new RXAvatar();
        avatar.setPrefSize(200,200);

        avatar.setImage(new Image(getClass().getResource("/img/2.jpg").toExternalForm()));

        root.setCenter(avatar);
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
        avatar.setShapeType(ShapeType.CIRCLE);
        avatar.setPrefSize(100,100);
        avatar.setEffect(new DropShadow());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
