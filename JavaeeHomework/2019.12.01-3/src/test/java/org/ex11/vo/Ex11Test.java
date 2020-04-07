package org.ex11.vo;

import org.ex10.vo.Course__;
import org.ex10.vo.Student_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

import java.util.HashSet;
import java.util.Set;


public class Ex11Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Address_ address_=new Address_();
        Address_ address_1=new Address_();
        Customer_ customer_=new Customer_();
        address_.setCity("cs");
        address_.setCode("10010");
        address_.setDescription("cscs");
        address_.setNation("css");
        address_.setProvince("123");
        address_1=address_;
        address_1.setCity("shsh");
        address_.setCustomer_(customer_);
        address_1.setCustomer_(customer_);
        Set ads=new HashSet();
        ads.add(address_);
        ads.add(address_1);
        customer_.setAccount("1111");
        customer_.setAddress(ads);
        customer_.setAge(111);
        customer_.setPasswd("aaaa");
        customer_.setTel("1111");
        session.save(customer_);
        Transaction ts=session.beginTransaction();

        ts.commit();;
    }

}
