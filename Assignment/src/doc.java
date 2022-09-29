
import java.awt.Desktop;
import java.io.File;
import java.io.IOException; 
public class doc {

public class OpenDocExample {

	public void main(String[] args) {

//Create file object
File file = new File("C:\\Users\\ShivaniShukla\\Desktop\\UML libaray system.docx");
try {
//Open the file using Desktop class
Desktop.getDesktop().open(file);
}catch (IOException exception){
exception.printStackTrace();
}
	}}}

