package ex4;

import ex1.dao.StudentDao;
import ex1.dao.impl.Studentimpl;
import ex1.vo.Student;
import org.junit.Test;

import java.util.List;

public class ex4test {
    @Test
    public void test(){
        StudentDao studentDao=new Studentimpl();
        List list=studentDao.getAllAtudent();
        System.out.println(list);
    }
}
