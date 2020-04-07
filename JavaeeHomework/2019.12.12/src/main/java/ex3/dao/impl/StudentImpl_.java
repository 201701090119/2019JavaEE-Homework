package ex3.dao.impl;

import ex1.vo.Student;
import ex2.dao.StudentClassDao;
import ex2.vo.StudentClass;
import ex3.dao.StudentDao_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateSessionFactory;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentImpl_ implements StudentDao_ {
    @Override
    public Map<Student,StudentClass> get_allStudent() {
        Map<Student,StudentClass> res_map=new HashMap<>();
        Session session= HibernateSessionFactory.getSession();
        Transaction ts=session.beginTransaction();
        Query query=session.createQuery("from Student S_ left JOIN StudentClass S_class on S_.stuClassId=S_class.classId");
        List<Object[]> list=query.list();
        for(Object[] i : list){
            System.out.println(((Student)i[0]).toString());
            System.out.println(((StudentClass)i[1]).toString());
            res_map.put((Student)i[0],(StudentClass)i[1]);
        }
        return res_map;
    }
}
