package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {

  @FXML
  public GridPane root;

  @FXML
  public void doStep1(ActionEvent actionEvent) {
    Stage stage = new Stage(StageStyle.DECORATED);
    stage.setTitle("Title");
    stage.initModality(Modality.NONE);

    Button b = new Button("Hello");
    b.setMinWidth(200.0);
    Scene scene = new Scene(new HBox(b));
    stage.setScene(scene);

    stage.show();
  }

  @FXML
  public void doStep2(ActionEvent actionEvent) {
    Alert alert = new Alert(AlertType.INFORMATION);
    alert.setHeaderText("INFO");
    alert.initOwner(this.root.getScene().getWindow());
    alert.setOnCloseRequest(event -> this.root.toFront());
    alert.show();
  }
}
