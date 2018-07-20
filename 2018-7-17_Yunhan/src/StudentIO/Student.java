package StudentIO;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	private int stuId = 100000000;
	private String stuName = "None";
	private String birth = "None";

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Student() {

	}

	public Student(int stuId, String stuName, String birth) {
		this.stuId = stuId;
		this.stuName = stuName;
		this.birth = birth;
	}

	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", birth=" + birth + "]";
	}


}
