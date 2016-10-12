/***
 * 
 * @author anikavichare
 *
 */
public class CSVData {

	private double[][] data;// if static, we cannot make data objects with
							// different data variables
	private String[] columnNames;

	// number of rows: data.length

	public static CSVData readCSVFile(String filename, int numLinesToIgnore, String[] columnNames) {

		return null;

	}

	/***
	 * Returns a new CSV Data object for a file ignoring lines at the top It
	 * uses the first row as column names. All other data is stored as doubles.
	 * 
	 * @param filename
	 *            the file to read
	 * @param numLinesToIgnore
	 *            number of lines at the top to ignore
	 * @return a CSV data object for that file
	 */
	public static CSVData readCSVFile(String filename, int numLinesToIgnore) {
		return null;

	}

	/***
	 * returns a row
	 * 
	 * @param rowIndex
	 *            index of the row to return
	 * @return the row we're returning
	 */
	public double[] getIndividualRow(int rowIndex) {
		return null;
	}

	/***
	 * returns an individual column
	 * 
	 * @param columnIndex
	 *            index of column being returned
	 * @return the column we're returning
	 */
	public double[] getIndividualColumn(int columnIndex) {
		return null;
	}

	public double[] getIndividualColumn(String name) {
		return null;
	}

	/***
	 * returns multiple rows
	 * 
	 * @param startIndex
	 *            first index of rows
	 * @param endIndex
	 *            last index of rows being returned
	 * @return the rows that we're returning
	 */
	public double[][] getRows(int startIndex, int endIndex) {
		return null;
	}

	public double[][] getRows(int[] rowIndexes) {
		return null;
	}

	/***
	 * returns multiple columns
	 * 
	 * @param startIndex
	 *            first index of columns
	 * @param endIndex
	 *            last index of columns
	 * @return the columns that we're returning
	 */
	public double[][] getColumns(int startIndex, int endIndex) {
		return null;
	}

	public double[][] getColumns(String[] columnNames) {
		return null;
	}

	/***
	 * 
	 * @param rowIndex index of the row to return
	 * @param columnIndex index of the column to return
	 * @param newValue new value to set existing entry to
	 * @ return new Individual entry
	 */
	public void setIndividualEntry(int rowIndex, int columnIndex, double newValue) {

	}

	public void saveToFile(String filename) {

	}

}
