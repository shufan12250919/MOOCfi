package notifier;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

public class NotifierApplication extends Application{
    
    @Override
    public void start(Stage window) {
        TextField topText = new TextField();
        Label downText = new Label();
        Button button = new Button("Copy");
        
        
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                downText.setText(topText.getText());
            }
        };
        
        
        button.setOnAction(event);
        

        VBox componentGroup = new VBox();
        //componentGroup.setSpacing(20);
        componentGroup.getChildren().addAll(topText, button, downText);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
