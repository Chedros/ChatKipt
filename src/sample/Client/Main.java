package sample.Client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("ChatKipt");
        primaryStage.setScene(new Scene(root, 745, 437));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
