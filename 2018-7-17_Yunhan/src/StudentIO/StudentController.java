package StudentIO;

import java.util.ArrayList;

public class StudentController {
	
	private ArrayList<Student> defalutList = new ArrayList<Student>();

	public ArrayList<Student> getDefalutList() {
		return defalutList;
	}

	public void setDefalutList(ArrayList<Student> defalutList) {
		this.defalutList = defalutList;
	}

	public StudentController addStudent(Student s){
		this.defalutList.add(s);
		return this;
	}
	
	public ArrayList<Student> BuildStudentList() {
		return new ArrayList<Student>();
	}
	
	public ArrayList<Student> BuildStudentList(int count) {
		return new ArrayList<Student>(count);
	}
}
