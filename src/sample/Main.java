package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Login Page");

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(25,25,25,25));

        Text sceneTitle = new Text("WELCOME");
//        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,20));
        gridPane.add(sceneTitle,0,0,2,1);

        Label userName = new Label("User Name");
        gridPane.add(userName,0,1);

        TextField userTextField = new TextField();
        gridPane.add(userTextField,1,1);

        Label pw = new Label("Password");
        gridPane.add(pw,0,2);

        PasswordField pwBox = new PasswordField();
        gridPane.add(pwBox,1,2);

        Button btnSignIn= new Button("Sign In");
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(btnSignIn);
        gridPane.add(hBox,1,4);

        final  Text actionTarget = new Text();
        gridPane.add(actionTarget,1,6);

        sceneTitle.setId("welcome-text");
        actionTarget.setId("actionTarget");


        btnSignIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
//                actionTarget.setFill(Color.FIREBRICK);
                /*actionTarget.setText("Loggin You In");
                System.out.println ("Loggin You In");*/

                if (userName.getText().isEmpty()){
                    (Alert.AlertType.ERROR, gridPane.getScene().getWindow(),"Error, Enter User Name!");
                }
            }
        });


        Scene scene = new Scene(gridPane ,300,275);

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Main.class.getResource("Login.css").toExternalForm());
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
