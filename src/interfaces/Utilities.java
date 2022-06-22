package interfaces;

import java.nio.file.Path;
import java.nio.file.Paths;

import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;

public interface Utilities
{
	String USERPSWD = "user";
    String USERNAME = "user";
    String ADMINPSWD = "admin";
    String ADMINNAME = "admin";
    Path PATHNAME = Paths.get(Paths.get("").toAbsolutePath().toString() + "/names");
    
    
    /**
     * Just added on the 30/05/2020 4:08 am
	 * This method is for choosing file from the project default folder
	 */
	default FileChooser defaultDirectory(FileChooser fileChooser)
	{
		fileChooser = new FileChooser();
		 fileChooser.setInitialDirectory(Paths.get(".").toAbsolutePath().toFile());
		 fileChooser.getExtensionFilters().addAll(// filters the files...
		         new ExtensionFilter("Binary Files", "*.dat"),
		         new ExtensionFilter("Comma Separated Files", "*.csv"),
		         new ExtensionFilter("Text Files", "*.txt"));
		 return fileChooser;
	}

}
