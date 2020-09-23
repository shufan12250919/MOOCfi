/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.scene.layout.BorderPane;
/**
 *
 * @author linshu-fan
 */
public class PlayGround {
    private String symbol;
    private Label title;
    
    public PlayGround(){
        symbol = "X";
    }
    public Parent getView() {
        BorderPane box = new BorderPane();
        title = new Label("Turn: X");
        box.setTop(title);
        
        
        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(10, 10, 10, 10));
        layout.setVgap(10);
        layout.setHgap(10);
        Tic t = new Tic(title, layout);
        
        
        box.setCenter(layout);
        return box;
    }
    
   
    
}
