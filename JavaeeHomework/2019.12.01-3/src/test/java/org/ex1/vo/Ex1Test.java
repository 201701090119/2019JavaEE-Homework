package org.ex1.vo;

import org.ex1.vo.Bks;
import org.ex1.vo.Yjs;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class Ex1Test {

    @Test
    public void saveYjs(){
        Session session= HibernateSessionFactory.getSession();
        Yjs yjs=new Yjs();
        yjs.setXsId(1111);
        yjs.setXm("miaoz");
        Date date=new Date();
        yjs.setXh("12345");
        yjs.setBir(date);
        yjs.setResearchResult("很多成果1");
        Transaction ts=session.beginTransaction();
        session.save(yjs);
        ts.commit();;
    }
    @Test
    public void saveXs(){
        Session session= HibernateSessionFactory.getSession();
        Bks bks =new Bks();
        bks.setXm("miaoz");
        Date date=new Date();
        bks.setXh("12345");
        bks.setBir(date);
        bks.setKy(true);
        Transaction ts=session.beginTransaction();
        session.save(bks);
        ts.commit();;
    }
    @Test
    public void querry(){
        Session session= HibernateSessionFactory.getSession();
        List list =session.createQuery("from Yjs").list();
        for(int i=0;i<list.size();i++){
            Yjs yjs =(Yjs)list.get(i);
            System.out.println(yjs.toString());
        }
        List list2 =session.createQuery("from Bks ").list();
        for(int i=0;i<list2.size();i++){
            Bks bks=(Bks) list2.get(i);
            System.out.println(bks.toString());
        }
    }
}
