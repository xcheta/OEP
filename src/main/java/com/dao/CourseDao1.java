package dao;

import model.OepCourse;

public interface CourseDao1 {
	
	public void createCourse(OepCourse course);
	public void insert();
	
	void updateCourse(long CourseId, String courseName);
	
	void deleteCourse(long courseId);

}


	
	


