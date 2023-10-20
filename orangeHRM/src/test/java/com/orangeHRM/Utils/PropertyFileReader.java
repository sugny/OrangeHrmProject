package com.orangeHRM.Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

	String propertyFilePath = "./src/test/resources/Global.properties";
	Properties prop;
	FileInputStream fis;

	public String getValues(String key) throws IOException {
		try {
			prop = new Properties();
			fis = new FileInputStream(propertyFilePath);
			prop.load(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
		return prop.getProperty(key);
	}

}
