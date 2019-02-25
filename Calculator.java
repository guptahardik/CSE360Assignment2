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
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * This constructor help to initialize variable total to zero.
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
	}
	/**
	 * This method adds the two values. Current total + parameter
	 * @param value entered by user or the main file
	 * @return current total
	 */
	
	public void subtract (int value) {
		total = total - value ;
	}
	/**
	 * This method subtracts the two values. 
	 * Current total - parameter value
	 * @param value entered by user or the main file
	 * @return current total
	 */
	
	public void multiply (int value) {
		total = total * value ;
	}
	/**
	 * This method multiplies the two values. 
	 * Current total * parameter value
	 * @param value entered by user or the main file
	 * @return current total
	 */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}else {
			total = total / value ;
		}
	}
	/**
	 * This method divides the two values. 
	 * Current total / parameter value
	 * The if statement checks if parameter entered
	 * is zero, if it is true the total value is set
	 * equal to zero if not the division successfully
	 * is done.
	 * @param value entered by user or the main file
	 * @return current total
	 */
	
	public String getHistory () {
		return "";
	}
	/**
	 * This method gets history of the values entered in the
	 * calculator
	 * @return: this will return the history asked for. 
	 */
}