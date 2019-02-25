/**
 * Name: Hardik Gupta
 * Class ID: 391
 * Assignment 2
 * Description: This class is given to the students 
 * for practice with using a version control system.
 * It is just a basic calculator class which needs
 * to be documented properly according to the JavaDoc
 * format and properly indented with structured programming.
*/

package cse360assign2;
/**
 * This connects the project and specifies the package
 */
/**
 * Declaration of the class Calculator
 */
public class Calculator {

	private int total;
	/**
	 * This integer type variable will store the current total
	 * value of the sum or the current value displayed after all
	 * operations.
	 */
	 private StringBuffer operationHistory;
	/**
	 * This variable operationHistory contains the sequence
	 * information of the operations done on the calculator.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		operationHistory = new StringBuffer("0");
	}
	/**
	 * This constructor help to initialize variable total to zero.
	 * The object for history is created and initialized with a zero too.
	 */
	
	public int getTotal () {
		return total;
	}
	/**
	 * The getTotal method is just a getter for the current 
	 * total value.
	 * @return: total value currently
	 */
	
	public void add (int value) {
		total = total + value ;
		operationHistory.append(" + " + value);
	}
	/**
	 * This method adds the two values. Current total + parameter
	 * Appends a subsequence of the specified 
	 * CharSequence to this sequence.
	 * @param value entered by user or the main file
	 */
	
	public void subtract (int value) {
		total = total - value ;
		operationHistory.append(" - " + value);
	}
	/**
	 * This method subtracts the two values. 
	 * Current total - parameter value
	 * @param value entered by user or the main file
	 * Appends a subsequence of the specified 
	 * CharSequence to this sequence.
	 */
	
	public void multiply (int value) {
		total = total * value ;
		operationHistory.append(" * " + value);
	}
	/**
	 * This method multiplies the two values. 
	 * Current total * parameter value
	 * @param value entered by user or the main file
	 * Appends a subsequence of the specified 
	 * CharSequence to this sequence.
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}else {
			total = total / value ;
		}
		operationHistory.append(" / " + value);
	}
	/**
	 * This method divides the two values. 
	 * Current total / parameter value
	 * The <if(value == 0)> statement checks if parameter 
	 * entered is zero, if it is true the total value is set
	 * equal to zero if not the division successfully
	 * is done with the help of <else> statement.
	 * @param value entered by user or the main file
	 * Appends a subsequence of the specified 
	 * CharSequence to this sequence.
	 */
	
	public String getHistory () {
		return operationHistory.toString();
	}
	/**
	 * This method gets history of the values entered in the
	 * calculator
	 * @return: this will return the history asked for. 
	 */
}