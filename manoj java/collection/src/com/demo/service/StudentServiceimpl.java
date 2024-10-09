package com.demo.service;

import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoimpl;

public class StudentServiceimpl implements StudentService{
	StudentDao sd=new StudentDaoimpl();
}
