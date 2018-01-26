package jetzt;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GraphView extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;

	/**
	 * Diese Methode wird beim Start der Anwendung automatisch aufgerufen und sorgt
	 * fuer die Initialisierung des Layout
	 */
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Graph");

		try {
			initLayout();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Initialisiert das Layout aus dem XML-Dokument
	 * 
	 * @throws IOException
	 *             Fehler beim Einlesen der XML
	 */
	public void initLayout() throws IOException {
		// Lade die zugehoerige XML-Datei
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(GraphView.class.getResource("Graph.fxml"));
		rootLayout = (BorderPane) loader.load();

		// Darstellung
		Scene scene = new Scene(rootLayout);
		primaryStage.setScene(scene);

		primaryStage.show();
	}

	/**
	 * Main-Methode
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
