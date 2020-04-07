package ex2;

import ex1.dao.StudentDao;
import ex2.dao.StudentClassDao;
import ex2.dao.impl.StudentClassimpl;
import org.junit.Test;

public class ex2test {
    @Test
    public void test(){
        StudentClassDao studentClassDao=new StudentClassimpl();
        System.out.println(studentClassDao.getStudentCount().toString());
    }
}
