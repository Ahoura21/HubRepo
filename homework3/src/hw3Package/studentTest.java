package hw3Package;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class studentTest{

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		String FilePath = ("/Users/ahoura/workspace/HubRepo/homework3/src/hw3Package/FileText.txt");
			
			try {
				fr = new FileReader(FilePath);
				} 
			catch (FileNotFoundException e1) {
			
				System.out.println("The File path was not found, Try Again!");
				}
					br = new BufferedReader(fr);
					String text = "";
					try {
				while((text = br.readLine())!=null){
					System.out.println(text);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally{
				
				try{
					
				if(br != null){
					br = null;
				}if(fr != null){
					fr = null;
				}
				}catch(Exception ex){
					ex.printStackTrace();
				}
		System.out.println(" ----------  ");	// to make the output more clean and readable
		
		Student shagerd = new Student();
		shagerd.fillArray();
		
		System.out.println(" ----------  ");	// to make the output more clean and readable
		
		CourseInfo crs = new CourseInfo();
		crs.register();
		CourseInfo.StartingDay();
	}
	}
	
}

