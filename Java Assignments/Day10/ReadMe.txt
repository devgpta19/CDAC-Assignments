Student Management

com.demo.beans
Student.java  -----(Entity)  for Object Creation

com.demo.test
TestStudentManagementSystem.java -----(Contains Menu)    Execution Starts Main Method

com.demo.services
StudentService.java ----- Interface Only contains abstract methods
StudentServiceImpl.java ----- (Implements StudentService)
			----- (Override the Abstract methods)

com.demo.dao
StudentDao.java ----- Interface Only contains abstract methods
StudentDaoImpl.java ----- (Implements StudentDao)
		    ----- (Override the Abstract methods)

Student
	-- Student ID (user given)
	-- Enrollment Number (auto generated) {Formate : YYYYIETMM001}
	-- Name (user given)
	-- Marks 1 (user given)
	-- Marks 2 (user given)
	-- Marks 3 (user given)
	-- Student Email (User Given)
	-- Percentage (Calculate Percentage Using Marks)

TestStudentManagementSystem
	-- Add New Student
	-- Display All Students
	-- Search By ID
	-- Search By Name
	-- Search by Percentage
	-- Update Marks Using ID
	-- Delete Student By id
	-- Delete Student By Name
	-- Delete Student below x Persentage
	-- Sort Student By Id
	-- Sort Student By Name
	-- Sort Student By Percentage
	-- Exit