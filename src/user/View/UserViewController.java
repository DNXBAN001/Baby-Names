package user.View;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import model.Baby;

public class UserViewController implements Initializable 
{

    @FXML private Tab babyNameUsabilityTab;
    @FXML private AnchorPane rootStage;
    @FXML private Slider babyNameSlider;
    @FXML private TextField textFieldNameView;
    @FXML private LineChart<Number, Number> linechart;
    @FXML private PieChart pieChart;
    @FXML private Tab babyNameMeaningTab;
    @FXML private TextField textFieldNameMeaning;
    @FXML private TextArea txtAreaBabyName;
    @FXML private TableView<Baby> babyNameTable;
    @FXML private TableColumn<Baby, String> babyNameCol;
    @FXML private TableColumn<Baby, String> babyNameGender;
    @FXML private TableColumn<Baby, Integer> babyNameCount;
    @FXML private TableColumn<Baby, Short> babyNameBirthYear;
   

    /**
     * This method will be used to upload the lineChart and PieChart after finding
     * the baby's name as well as its count over the year read from the slider.
     * @param event
     */
    @FXML void searchBabyNameMeaning(KeyEvent event) 
    {



    }

    /**
     * This method will be used to fill the tableView with babies' names. Once the user has
     * input the baby's name in the textField, its meaning must be displayed in the textArea
     * after finding it.
     * @param event
     */
    @FXML void searchBabyNameUsability(KeyEvent event) 
    {

    }

    /**
     * This method initializes the user's interface with the necessary information in order
     * to provide the expected services.
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
       

    }
}

