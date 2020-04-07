package org.ex6.vo;

import org.ex3.vo.Detail;
import org.ex3.vo.Login;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

public class Ex6Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Mayor mayor=new Mayor();
        City city=new City();
        mayor.setmAge(100);
        mayor.setmName("miaoz");
        mayor.setmGender("男");
        mayor.setmTel("110");
        city.setcArea(Double.valueOf(9600000000.9));
        city.setcName("长沙");
        city.setcPopulation(Integer.valueOf(1000000000));

        city.setMayor(mayor);
        mayor.setCity(city);


        session.save(mayor);
        Transaction ts=session.beginTransaction();
        ts.commit();;
    }
    @Test
    public void delete(){
        Session session= HibernateSessionFactory.getSession();
        Mayor mayor=new Mayor();
        mayor.setCid(2);
        Transaction ts=session.beginTransaction();
        session.delete(mayor);

        ts.commit();;

    }

}
