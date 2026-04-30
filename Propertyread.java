package SeleniumDemo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File ("C:\\Users\\icity\\OneDrive\\Documents\\selinium\\Kavs_Selinium\\JAVA_Selinum\\Selenium\\input.properties"); 
	 FileInputStream fis=new FileInputStream(f); 
	 Properties prop=new Properties(); 
	 prop.load(fis); 
	 String googleurl=prop.getProperty("password");
	 System.out.println(googleurl);
	
	}

}
