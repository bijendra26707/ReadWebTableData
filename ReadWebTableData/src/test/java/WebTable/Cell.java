package WebTable;
import org.openqa.selenium.WebElement;

public class Cell {
private final WebElement root;
private final String columnName;

Cell(WebElement root, String columnName){
	this.root=root;
	this.columnName=columnName;
}

/** Gets current cell text. */
public String getText(){
	return root.getText();
}

/** Gets current cell column name. */
public String getColumnName(){
	return columnName;
}

/** Gets current cell WebElement. */
public WebElement getRoot(){return root;}
}
