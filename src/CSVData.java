/***
 * 
 * @author anikavichare
 *
 */
public class CSVData {

	private double [][] data;//if static, we cannot make data objects with different data variables
	private String [] columnNames;
	
	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[]columnNames){
		
		return null;
		
	}
	/***
	 * Returns a new CSV Data object for a file ignoring lines at the top
	 * It uses the first row as column names. All other data is stored as doubles.
	 * @param filename the file to read
	 * @param numLinesToIgnore number of lines at the top to ignore
	 * @return a CSV data object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore){
		return null;
		
		
	}
	/***
	 * returns a row
	 * @param rowIndex index of the row to return
	 * @return the row we're returning
	 */
	public double[] getIndividualRow(int rowIndex){
		return null;
	}
	
	public double[] getIndividualColumn(int columnIndex){
		return null;
	}
	
	public double[] getIndividualColumn(String name){
		return null;
	}
	
	
	public double[][] getRows(int startIndex, int endIndex){
		return null;
	}
	
	public double[][] getRows(int [] rowIndexes){
		return null;
	}
	
	
	
	public double[][] getColumns(int startIndex, int endIndex){
			return null;
	}
	
	public double[][] getColumns(String [] columnNames){
		return null;
}
	
	public void setIndividualEntry(int rowIndex, int columnIndex, double newValue){
		
	}
	
	public void saveToFile(String filename){
		
	}
	
	
	
	
}
