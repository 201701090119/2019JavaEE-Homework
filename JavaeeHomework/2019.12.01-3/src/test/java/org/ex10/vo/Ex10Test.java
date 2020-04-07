package org.ex10.vo;

import org.ex9.vo.Course;
import org.ex9.vo.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

import java.util.HashSet;
import java.util.Set;


public class Ex10Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Course__ course1=new Course__();
        Course__ course2=new Course__();
        Set courses=new HashSet();
        course1.setCnumber("111");
        course1.setCname("kx");
        course2.setCname("js");
        course2.setCnumber("222");
        courses.add(course1);
        courses.add(course2);
        Student_ student=new Student_();
        student.setCourses(courses);
        student.setSage(100);
        student.setSname("miaoz");
        student.setSnumber("110");
        session.save(student);
        Transaction ts=session.beginTransaction();

        ts.commit();;
    }

}
