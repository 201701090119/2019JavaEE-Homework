package org.ex4.vo;

import org.ex4.vo.Person;
import org.ex4.vo.Room;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

public class Ex4Test {
    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Person person=new Person();
        person.setName("miaoz");
        Room room=new Room();
        room.setAddress("14-604");
        person.setRoom(room);


        session.save(person);
        Transaction ts=session.beginTransaction();
        ts.commit();;
    }
}
