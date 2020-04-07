package org.ex5.vo;

import org.ex5.vo.Person_;
import org.ex5.vo.Room_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;


public class Ex5Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Room_ room=new Room_();
        room.setAddress("14-60411");
        Person_ person=new Person_();
        person.setName("miaoz");
        person.setRoom(room);
        session.save(person);
        Transaction ts=session.beginTransaction();
        ts.commit();;
    }

}
