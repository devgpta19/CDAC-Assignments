package com.demo.dao;

import com.demo.beans.Course;

public interface CourseDao {

	boolean save(Course c);

	Course showCourse(int cid);

}
