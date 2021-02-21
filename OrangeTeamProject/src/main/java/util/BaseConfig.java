package util;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {
	
	public static String getConfigInfo(String info) throws Throwable{
		
		String path = "./ConfigFIle";
		FileInputStream fis = new FileInputStream(path); 
		
		Properties obj = new Properties();
		obj.load(fis);
		return obj.getProperty(info);
		
	}

}
