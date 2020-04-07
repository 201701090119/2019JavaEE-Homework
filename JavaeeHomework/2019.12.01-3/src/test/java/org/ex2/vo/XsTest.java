package org.ex2.vo;

import org.ex2.vo.Bks_;
import org.ex2.vo.Yjs_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class XsTest {

    @Test
    public void saveYjs(){
        Session session= HibernateSessionFactory.getSession();
        Yjs_ yjs=new Yjs_();
        yjs.setXsId(1111);
        yjs.setXm("miaoz");
        Date date=new Date();
        yjs.setXh("12345");
        yjs.setBir(date);
        yjs.setResearchResult("很多成果2");
        Transaction ts=session.beginTransaction();
        session.save(yjs);
        ts.commit();;
    }
    @Test
    public void saveXs(){
        Session session= HibernateSessionFactory.getSession();
        Bks_ bks =new Bks_();
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
        List list =session.createQuery("from Yjs_ ").list();
        for(int i=0;i<list.size();i++){
            Yjs_ yjs =(Yjs_)list.get(i);
            System.out.println(yjs.toString());
        }
        List list2 =session.createQuery("from Bks_ ").list();
        for(int i=0;i<list2.size();i++){
            Bks_ bks=(Bks_) list2.get(i);
            System.out.println(bks.toString());
        }
    }
}
