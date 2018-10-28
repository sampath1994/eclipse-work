import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

	// Directory Path
	private static String dirPath ="C:\\Users\\promod\\Documents\\test1\\test2\\testing.txt";

	public static void main(String[] args) {

		File file = new File(dirPath);
		
		
			    Path newFilePath = Paths.get(dirPath);
			    try {
					Files.createFile(newFilePath);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
		
		
		/*if(Files.isDirectory(file);)
		{
			System.out.println("not a dir path!");
		}*/
		// Check If Directory Already Exists Or Not?
	/*	Path dirPathObj = Paths.get(dirPath);
		boolean dirExists = Files.exists(dirPathObj);
		if(dirExists) {
			System.out.println("! Directory Already Exists !");
		} else {
			try {
				// Creating The New Directory Structure
				Files.createDirectories(dirPathObj);
				System.out.println("! New Directory Successfully Created !");
			} catch (IOException ioExceptionObj) {
				System.out.println("Problem Occured While Creating The Directory Structure= " + ioExceptionObj.getMessage());
			}
		}*/
	}
}