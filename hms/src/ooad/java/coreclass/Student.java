package ooad.java.coreclass;

import java.util.Date;

public class Student extends User {

	public Student(String name, String user_name, String password) {
		super(name, user_name, password);
		// TODO Auto-generated constructor stub
	}
	//return true if raised successfully
	public boolean RaiseComplaint(String name,String Complaint) {
		return false;
	}
	//return if update successfully
	public boolean UpdateStatus(String name,int Complaint) {
		return false;
	}
	public boolean RequestOS(String name,Date datein,Date dateout) {
		return false;
	}
	public boolean GiveFeedback(String name,int Complaint,int Feedback) {
		return false;
	}
}
