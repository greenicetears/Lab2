package mypackage;


public class Course {
	
	private int number;
	private String title;
	private String description;
	private String department;

public Course(int id, String t, String des, String dep) {
	
	this.number = id;
	this.title = t;
	this.description = des;
	this.department = dep;
}
public String getTitle() {
	return this.title;
}
public void setTitle(String tit) {
	this.title = tit;
}
public int getId() {
	return this.number;
}
public void setId(int id) {
	this.number = id;
}
public String getDepartment() {
	return this.department;
}
public void setDepartment(String dep) {
	this.department = dep;
}
public String getDescription() {
	return this.description;
}
public void setDescription(String des) {
	this.description = des;
}

}
