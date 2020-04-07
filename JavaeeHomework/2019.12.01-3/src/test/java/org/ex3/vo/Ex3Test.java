package org.ex3.vo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;
import org.ex3.vo.Detail;
import org.ex3.vo.Login;

public class Ex3Test {

    @Test
    public void savelogin(){
        Session session= HibernateSessionFactory.getSession();
        Login login=new Login();
        Detail detail=new Detail();
        login.setUsername("miaoz");
        login.setPassword("11111111");
        detail.setEmail("1341312038@qq.com");
        detail.setTruename("缪z");

        login.setDetail(detail);
        detail.setLogin(login);


        session.save(detail);
        Transaction ts=session.beginTransaction();
        ts.commit();;
    }

}
