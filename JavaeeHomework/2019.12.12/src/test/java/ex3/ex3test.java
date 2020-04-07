package ex3;

import ex3.dao.StudentDao_;
import ex3.dao.impl.StudentImpl_;
import org.junit.Test;
public class ex3test {
    @Test
    public void test(){
        StudentDao_ studentDao_=new StudentImpl_();
        System.out.println(studentDao_.get_allStudent().toString());
    }
}
