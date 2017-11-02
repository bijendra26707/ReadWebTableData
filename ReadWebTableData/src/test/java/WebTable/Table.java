package WebTable;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table {
	public static final By TABLE=By.xpath(".//table");
	private static final String TABLE_HEADER="./thead/tr/th";
	private static final String TABLE_ROW="./tbody/tr";
	public final WebElement root;
	
	public Table(WebElement element){root=element; }
	
	public List<Row> getAllRows(){
		ArrayList<Row> result=new ArrayList<Row>();
		List<String> titles=getColumnTitles();
		for(WebElement row : root.findElements(By.xpath(TABLE_ROW))){
			result.add(new Row (row, titles));
			
		}
		return result;
		
	}
	
	public List <String> getColumnTitles(){
		ArrayList<String> result=new ArrayList<String>();
		for(WebElement title : root.findElements(By.xpath(TABLE_HEADER))){
		result.add(title.getText());	
			
		}
		return result;
	}
	
	
	public Row findRowWithTextInColumn(String columnName, String text){
		for(Row row: getAllRows()){
			if(row.getCellByColumnName(columnName).getText().equals(text)){
				return row;
			}
		}
		return null;
		
	}

}
