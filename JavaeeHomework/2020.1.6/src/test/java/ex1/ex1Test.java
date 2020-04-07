package ex1;

import ex1.dao.StudentDao;
import ex1.dao.impl.Studentimpl;
import ex1.vo.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import util.HibernateSessionFactory;

public class ex1Test {
    @Test
    public void ex1test(){
        Session session= HibernateSessionFactory.getSession();
        Transaction ts=session.beginTransaction();
        Student student=new Student();
        student.setStuAge(15);
        student.setStuClassId(11);
        student.setStuGender("abc");
        student.setStuName("aa");
        student.setStuNo(11);
        student.setStuId(11);
        session.save(student);
        ts.commit();
    }
    @Test
    public void test2(){
        Studentimpl studentimpl = new Studentimpl();
        for(Object i:studentimpl.getZhangWuJiAges()){
            Student student =(Student)i;
            System.out.println(i.toString());
        }
    }
}
