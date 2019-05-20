package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;



public class Controller {
    @FXML private TableView<Persona> tableView;
    @FXML private Label label;

    @FXML ObservableList<Persona> personas = FXCollections.observableArrayList(
            new Persona("pepe", "666999666"),
            new Persona("rosa", "666999665"),
            new Persona("maría", "666999664")
    );
    public void initialize() {
        System.out.println("initialize ejecutado");
        label.setText("Cambiado en initialize");
        //tableView.getItems().add(new Persona("pepe", "666999666"));
        tableView.setItems(personas);
    }

    @FXML private void onButtonAction(ActionEvent actionEvent) {
        personas.add(new Persona("nuevo", "444444444"));
    }

    public static class Persona {
        private String nombre;
        private String telefono;

        public Persona(String nombre, String telefono) {
            this.nombre = nombre;
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }
    }
}
