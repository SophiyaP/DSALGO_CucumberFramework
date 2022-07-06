package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class configPropertiesFile {
	
	public static Properties readPropertiesFile() throws IOException  { 
	//Create Object for Properties Class
Properties prop=new Properties();
// Create object for Class InputStream to read the config.properties File where all parameters are stored
InputStream input=new FileInputStream("C:\\Users\\sofij\\eclipse-workspace\\DSALGO_Cucumber_Framework\\src\\test\\java\\utils\\config.properties");

prop.load(input);
return prop;
}

public static String getURL() throws IOException {
	return readPropertiesFile().getProperty("url");
}

public static String getUserName() throws IOException
{
	return readPropertiesFile().getProperty("Username");
	
}
public static String getPassword() throws IOException
{
	return readPropertiesFile().getProperty("Password");
}
public static String pythonCode() throws IOException 
{
	return readPropertiesFile().getProperty("pythonCode");
}
}
