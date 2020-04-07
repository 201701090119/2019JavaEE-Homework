package org.ex8.vo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;


public class Ex8Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Person_1 person_1=new Person_1();
        Person_1 person_2 =new Person_1();
        Room_1 room_1=new Room_1();
        room_1.setAddress("14-604");
        person_1.setName("miaoz1");
        person_2.setName("hz");
        person_1.setRoom(room_1);
        person_2.setRoom(room_1);


        //session.save(person_1);
        session.save(person_2);
        Transaction ts=session.beginTransaction();

        ts.commit();;
    }

}
