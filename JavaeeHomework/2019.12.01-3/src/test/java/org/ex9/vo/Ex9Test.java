package org.ex9.vo;

import org.ex8.vo.Person_1;
import org.ex8.vo.Room_1;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

import java.util.HashSet;
import java.util.Set;


public class Ex9Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Course course1=new Course();
        Course course2=new Course();
        Set courses=new HashSet();
        course1.setCnumber("111");
        course1.setCname("kx");
        course2.setCname("js");
        course2.setCnumber("222");
        courses.add(course1);
        courses.add(course2);
        Student student=new Student();
        student.setCourses(courses);
        student.setSage(100);
        student.setSname("miaoz");
        student.setSnumber("110");
        session.save(student);
        Transaction ts=session.beginTransaction();

        ts.commit();;
    }

}
