package book.chapter17introducingjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Ch17p592JavaFXEventDemo extends Application {
    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
    }

    // Not necessary to @Override init()
    @Override
    public void init() {
        System.out.println("Inside the init() method");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Give the stage a title
        primaryStage.setTitle("Use JavaFX Buttons and Events.");

        // Use a FlowPane for the root node.
        FlowPane rootNode = new FlowPane(10, 10);

        // Center the controls in the scene
        rootNode.setAlignment(Pos.CENTER);

        // Create a scene
        Scene scene = new Scene (rootNode, 300, 100);

        // Set he scene on the stage
        primaryStage.setScene(scene);

        // Create a Label
        Label label = new Label("Push the button");

        // Create two push buttons
        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");

        // Handle the action events for the Up button with anonymous class
        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                label.setText("You pushed Up");
            }
        });

        // Handle the action events for the Down button with lambda
        btnDown.setOnAction((ae) -> label.setText("You pushed Down"));

        // Add buttons to the scene graph
        rootNode.getChildren().addAll(btnUp, btnDown);

        // Add the label to the scene graph
        rootNode.getChildren().add(label);

        // Show the stage and its scene
        primaryStage.show();
    }

    // Not necessary to @Override stop()
    @Override
    public void stop() {
        System.out.println("Inside the stop() meethod");
    }
}
