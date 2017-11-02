package WebTable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Row {
private static final String ROW_Cell="./td";
private final  List<String> columnNames;
private final WebElement root;

Row(WebElement root, List<String>columnNames){
	this.root=root;
	this.columnNames=columnNames;
}

/** Return {@link WebElement} of current {@link Row}. */
public WebElement getRow(){
	return root;	
}

/** Returns {@link Cell} by zero based index. */ 
private Cell getCellByIndex(int index){
	if(columnNames.size()<index){
		throw new IndexOutOfBoundsException("Cant get cell with index %s, Selected row contains only %s elements."
				+index+columnNames.size());
	}
	
	int xpathIndex = index + 1;
	return new Cell(root.findElement(By.xpath(ROW_Cell + "[" + xpathIndex + "]")),columnNames.get(index));
}

/** Returns {@link Cell} by {@link title}. */
public Cell getCellByColumnName(String columnName){
	return getCellByIndex(this.columnNames.indexOf(columnName));
}

}


