package praktikum6;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        TableView<Mahasiswa> tableView = new TableView<>();

        TableColumn<Mahasiswa, String> columnNim = new TableColumn<>("NIM");
        columnNim.setCellValueFactory(new PropertyValueFactory<>("nim"));

        TableColumn<Mahasiswa, String> columnNama = new TableColumn<>("Nama");
        columnNama.setCellValueFactory(new PropertyValueFactory<>("nama"));

        tableView.getColumns().addAll(columnNim, columnNama);

        ObservableList<Mahasiswa> data = FXCollections.observableArrayList(
                new Mahasiswa("220101", "Andi"),
                new Mahasiswa("220102", "Budi"),
                new Mahasiswa("220103", "Citra"),
                new Mahasiswa("220104", "Dian"),
                new Mahasiswa("220105", "Eka"),
                new Mahasiswa("220106", "Farah"),
                new Mahasiswa("220107", "Gilang"),
                new Mahasiswa("220108", "Hana"),
                new Mahasiswa("220109", "Indra"),
                new Mahasiswa("220110", "Joko")
        );

        tableView.setItems(data);

        VBox vbox = new VBox(tableView);
        Scene scene = new Scene(vbox, 400, 300);

        primaryStage.setTitle("Daftar Mahasiswa");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
