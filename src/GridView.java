import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;

public class GridView extends GridPane {
    public GridView() {
        TableView itemTableView = new TableView();
        addColumn(0, itemTableView);
    }
}
