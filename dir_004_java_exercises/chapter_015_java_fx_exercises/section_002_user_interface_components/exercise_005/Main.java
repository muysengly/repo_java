
//Main.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "pass123";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login Form");

        // Create labels for username and password fields.
        Label usernameLabel = new Label("Username:");
        Label passwordLabel = new Label("Password:");

        // Create text input fields for username and password.
        TextField usernameField = new TextField();
        PasswordField passwordField = new PasswordField();

        // Create a label to display the login result.
        Label resultLabel = new Label();

        // Create a "Login" button.
        Button loginButton = new Button("Login");

        // Set an action for the "Login" button to validate the credentials.
        loginButton.setOnAction(event -> {
            String enteredUsername = usernameField.getText();
            String enteredPassword = passwordField.getText();

            if (enteredUsername.equals(CORRECT_USERNAME) && enteredPassword.equals(CORRECT_PASSWORD)) {
                resultLabel.setText("Login successful!");
            } else {
                resultLabel.setText("Login failed. Please check your credentials.");
            }
        });

        // Create a layout (VBox) to arrange the elements.
        VBox root = new VBox(10);
        root.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton, resultLabel);

        // Create the scene and set it in the stage.
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        // Set the title of the window.
        primaryStage.setTitle("Login Form App");

        // Show the window.
        primaryStage.show();
    }
}
