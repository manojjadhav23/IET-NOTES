package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Student;

public class StudentDaoimpl implements StudentDao {
	 private static List<Student> studlist; 
	 
	 static {
		 studlist=new ArrayList<>();
	 }

	
}
