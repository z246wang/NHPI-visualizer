# Description

NHPI Visualizer is a project for visualizing canadian house market. It uses Java Swing, the Apache Commons Math Library, WEKA, JFreeChart and a mySQL database.
echoData.scv saved 20 year house values from Statistics Canada.

## How To Use:

The main executable java file is MainTest.java (in the SQLConnection package).

Input your own SQL url, username, and password in all the classes under the SQLConnection package.

Then run MainTest.java to see the GUI and start the program.

```java

/**
 * Main executable class.
 */

public class MainTest {
	/**
	 * Main executable method to launch the program.
	 * @param args main arguments
	 */
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/echodata";
		String username = "root";
		String password = "password";
		
		Model model = Model.createConnection(url, username, password);
		View view = new View();
		Controller controller = new Controller(view, model);
	}

}
```
