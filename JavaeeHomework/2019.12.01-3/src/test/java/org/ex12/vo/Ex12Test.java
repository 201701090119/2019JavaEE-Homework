package org.ex12.vo;

import org.ex11.vo.Address_;
import org.ex11.vo.Customer_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;

import java.util.HashSet;
import java.util.Set;


public class Ex12Test {

    @Test
    public void save(){

       Session session= HibernateSessionFactory.getSession();
       Product_1 product =new Product_1();
       Product_1 product2 =new Product_1();
       Order_1 order_1=new Order_1();
       Order_1 order_2=new Order_1();
       product.setpName("薯片");
       product2.setpName("ks");
       order_1.setoName("od1");
       order_2.setoName("od2");
       order_1.setoPrice(111);
       order_2.setoPrice(120);
       Set ords=new HashSet();
       Set prods=new HashSet();
       ords.add(order_1);
       ords.add(order_2);
       prods.add(product);
       prods.add(product2);
       product.setOrders(ords);
       product2.setOrders(ords);
       order_1.setProducts(prods);
       order_2.setProducts(prods);

       session.save(ords);
        Transaction ts=session.beginTransaction();

        ts.commit();;
    }

}
