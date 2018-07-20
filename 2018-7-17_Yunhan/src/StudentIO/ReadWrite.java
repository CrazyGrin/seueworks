package StudentIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWrite {
	public static void main(String args[]) {
		
		StudentController scSource = new StudentController();
		StudentController scResult = new StudentController();
		
		scSource.addStudent(new Student())
				.addStudent(new Student())
				.addStudent(new Student());
		
		FileOutputStream fot = null;
		ObjectOutputStream oos = null;
		
		try {
			fot =new FileOutputStream("D:/Temp/Students.ser");
	        oos = new ObjectOutputStream(fot);
	        
	        for(int i = 0;i<scSource.getDefalutList().size();i++){
	        	oos.writeObject(scSource.getDefalutList().get(i));
	        }
	        
	        fot.close();
	        oos.close();
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
	        fis =new FileInputStream("D:/Temp/Students.ser");
	        ois = new ObjectInputStream(fis);
	        
	        while(fis.available()>0){
	        	scResult.addStudent((Student)ois.readObject());
	        }
	        fis.close();
	        ois.close();
	        
	        System.out.println(scResult.getDefalutList().toString());
	        
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
