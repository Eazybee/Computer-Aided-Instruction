package computeraidedinstruction;

import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.application.Application;

public class ComputerAidedInstruction extends Application
{
    @Override
    public void start(final Stage primaryStage) throws Exception {
        final FXMLLoader fXMLLoader = new FXMLLoader(this.getClass().getResource("/fxml/Main.fxml"));
        final Control controller = new Control();
        fXMLLoader.setController((Object)controller);
        final Parent root = (Parent)fXMLLoader.load();
        final Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Computer Aided Instruction For Nusery School On English Language");
        primaryStage.show();
    }
    
    public static void main(final String[] args) {
        launch(args);
    }
}
