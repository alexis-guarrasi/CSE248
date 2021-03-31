package multithreads;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainDemo extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("Hello");
		stage.show();
		System.out.println("Bye");
	}

}
