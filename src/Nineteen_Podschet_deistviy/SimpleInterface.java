package Nineteen_Podschet_deistviy;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.stage.*;



public class SimpleInterface extends Application {

    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Демонстрация простого интерфейса(нет)");
        final int[] n = {0};

        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 300, 200);
        stage.setScene(scene);


        Label req = new Label("Тыкай, я буду считать");
        Button btn = new Button("Жми!");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                n[0]++;
                btn.setText(""+n[0]);

            }


        });





        root.getChildren().addAll(req, btn);
        stage.show();







    }



}
