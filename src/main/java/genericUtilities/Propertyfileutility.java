package genericUtilities;

import java.io.FileInputStream;

import java.util.Properties;

  public class Propertyfileutility {
public String readdatafrompropertyfile(String key) throws Throwable {
	FileInputStream fis=new FileInputStream(Iconstantutility.propertypath);
	Properties p=new Properties();
	p.load(fis);
	String value=p.getProperty(key);
	return p.getProperty(key);
}
}
