package CopyFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile {
	public static void main(String args[]){
		File file = new File("D:/temp/users.txt");
		File targetFile = new File("D:/temp/usersT.txt");
		BufferedReader bf = null;
		BufferedWriter bw = null;
		try {
			 bf = new BufferedReader(new FileReader(file));
			 bw = new BufferedWriter(new FileWriter(targetFile));
			 String temp = "";
			 
			 while((temp=bf.readLine())!= null){
				System.out.println(temp);
				bw.write(temp + "\n");
			 }
			 bw.close();
			 bf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
