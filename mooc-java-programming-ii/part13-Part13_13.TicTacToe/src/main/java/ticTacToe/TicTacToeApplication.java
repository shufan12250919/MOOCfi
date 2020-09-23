package ticTacToe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class TicTacToeApplication extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {

        // 3. Create the higher level layout
        PlayGround play = new PlayGround();

        
        
 
        
 
        // 6. Create the main view and add the high level layout
        Scene view = new Scene(play.getView());
 
        // 7. Show the application
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
