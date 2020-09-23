package textstatistics;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import javafx.scene.control.TextArea;

public class TextStatisticsApplication extends Application{


    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        

        HBox labels = new HBox();
        Label letter = new Label("Letters: 0");
        Label word = new Label("Words: 0");
        Label longest = new Label("The longest word is:");
        labels.setSpacing(10);
        labels.getChildren().add(letter);
        labels.getChildren().add(word);
        labels.getChildren().add(longest);
        layout.setBottom(labels);
        TextArea area = new TextArea("");
        layout.setCenter(area);
        
        area.textProperty().addListener(new ChangeListener<String>(){
            
            @Override
            public void changed(ObservableValue<? extends String> change,
                String oldValue, String newValue) {
                int l = newValue.length();
                String[] ww = newValue.split(" ");
                int w = ww.length;
                String longestWord = "";
                for(String n : ww){
                    if(n.length() > longestWord.length()){
                        longestWord = n;
                    }
                }
                
                letter.setText("Letters: " + l);
                word.setText("Words: " + w);
                longest.setText("The longest word is: " + longestWord);
            }
        });
        
        


        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
