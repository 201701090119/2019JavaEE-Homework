package ex2.dao.impl;

import ex1.dao.StudentDao;
import ex1.vo.Student;
import ex2.dao.StudentClassDao;
import ex2.vo.StudentClass;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateSessionFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentClassimpl implements StudentClassDao {

    @Override
    public Map<StudentClass,Long> getStudentCount() {
        Map res_map=new HashMap();
        Session session= HibernateSessionFactory.getSession();
        Transaction ts=session.beginTransaction();
        Query query=session.createQuery("from StudentClass ");
        List list=query.list();
        System.out.println(list.size());
        for (StudentClass i:(List<StudentClass>)list){
            System.out.println(i.toString());
            //int classId=i.getClassId();

            Query query1=session.createQuery("select count(*) from Student where stuClassId=:classId");
            //query1.setParameter("classId",i.getClassId());
            query1.setParameter("classId",i.getClassId());
            Long cnt=(Long) query1.list().get(0);
            System.out.println("人数"+String.valueOf(cnt));
            res_map.put(i,cnt);
        }
        return res_map;
    }
}
