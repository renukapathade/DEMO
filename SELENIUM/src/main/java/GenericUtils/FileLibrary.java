package GenericUtils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import net.bytebuddy.asm.Advice.Return;

public class FileLibrary {
public String fetchDataFromProperties(String path, String key) {
	 File f = new File(path);
	 Properties prop= null;
	 try {
		 FileInputStream fis = new  FileInputStream(f);
		 prop = new Properties();
		 prop.load(fis);
		
	} catch (Exception e) {
		
	}
	String data =prop.getProperty(key);
	return data;
}
}