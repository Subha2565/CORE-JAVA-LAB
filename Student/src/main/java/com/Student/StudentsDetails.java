package com.Student;

public class StudentsDetails {
	 
	private String intstId;
	private String stName;
	private String courseName;
	private String totalfees;
	private String feessubmission;
	public StudentsDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentsDetails(String intstId, String stName, String courseName, String totalfees, String feessubmission) {
		super();
		this.intstId = intstId;
		this.stName = stName;
		this.courseName = courseName;
		this.totalfees = totalfees;
		this.feessubmission = feessubmission;
	}
	public String getIntstId() {
		return intstId;
	}
	public void setIntstId(String intstId) {
		this.intstId = intstId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getTotalfees() {
		return totalfees;
	}
	public void setTotalfees(String totalfees) {
		this.totalfees = totalfees;
	}
	public String getFeessubmission() {
		return feessubmission;
	}
	public void setFeessubmission(String feessubmission) {
		this.feessubmission = feessubmission;
	}
	@Override
	public String toString() {
		return "StudentsDetails [intstId=" + intstId + ", stName=" + stName + ", courseName=" + courseName
				+ ", totalfees=" + totalfees + ", feessubmission=" + feessubmission + "]";
	}
	
	
	

}
