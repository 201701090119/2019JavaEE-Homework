package ex1.dao.impl;

import ex1.dao.StudentDao;
import ex1.vo.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateSessionFactory;


import java.util.List;

public class Studentimpl implements StudentDao {
    @Override
    public List getZhangWuJiAges() {
        Session session= HibernateSessionFactory.getSession();
        Transaction ts=session.beginTransaction();

        Query query1 =session.createQuery("from Student where stuName ='张无忌'");
        List zwjList=query1.list();
        Student zwj=(Student)zwjList.get(0);
        int zwjage=(zwj.getStuAge());
        Query query2= session.createQuery("from Student where stuAge="+String.valueOf(zwjage));
        //"from Student where stuAge="+String.valueOf((Student)query1.list().get(0).getStuAge())
        return query2.list();
    }

    @Override
    public List getAllAtudent() {
        Session session= HibernateSessionFactory.getSession();
        Transaction ts=session.beginTransaction();
        List list=session.getNamedQuery("getAllStudent").list();
        return list;
    }

}
