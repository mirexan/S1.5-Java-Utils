package Level_02.Exercise01;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;


public class ListDir {
	public void start(){
		Properties properties = new Properties();
		try (FileInputStream inputProperties = new FileInputStream("Configuration.properties")){
			properties.load(inputProperties);
		}
		catch(IOException e){
			new RuntimeException("Error : " + e.getMessage());
		}
		File dir = new File(properties.getProperty("1LevelDirectory") + File.separator
				+ properties.getProperty("2LevelDirectory") + File.separator);
		String outName = properties.getProperty("outputName");
		String outDir = properties.getProperty("resultDirectory") + File.separator;
		listDirToFile(dir, outDir,outName);
	}

	private void listDirToFile(File dir, String outDir, String outName) {
		if (!dir.exists()) {
			throw new RuntimeException("Error theres is no \"" + dir
					+ "\" directory.");
		}
		makeOutDir(outDir);
		try {
			PrintWriter writer = new PrintWriter(new FileWriter(outDir + outName));
			writer.println("\n === List of Directories and files " +
					"from java source directory ===\n");
			listDir3(dir,"", writer);
		} catch (IOException e) {
			throw new RuntimeException("Error : " + e.getMessage());
		}
	}
	private void makeOutDir(String outDir){
		File outPutDir = new File(outDir);
		if (!outPutDir.exists()){
			outPutDir.mkdir();
		}
	}
	private void listDir3(File dir, String tab, PrintWriter writer) {
		List<File> files = Arrays.asList(dir.listFiles());
		Collections.sort(files);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		tab += "\t";
		for (File file : files) {
			String type = file.isDirectory() ? "(D)" : "(F)";
			String modificationDate = sdf.format(file.lastModified());
			writer.println(tab + file.getName() + " is a " + type
					+ " with modification date: " + modificationDate);
			if (file.isDirectory()) {
				writer.println("\n" + tab + "...Accessing to directory " + file.getName());
				listDir3(file, tab, writer);
			}
		}

	}
}
