package org.ex7.vo;

import org.ex5.vo.Person_;
import org.ex5.vo.Room_;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;
import org.util.HibernateSessionFactory;


public class Ex7Test {

    @Test
    public void save(){
        Session session= HibernateSessionFactory.getSession();
        Product product=new Product();
        ProductType productType=new ProductType();
        product.setpDescription("一瓶提神醒，脑两瓶永不疲劳，三瓶长生不老");
        product.setpName("肾宝");
        product.setpPrice(998);
        productType.settName("保健品");
        product.setProductType(productType);







        session.save(product);
        Transaction ts=session.beginTransaction();

        ts.commit();;
    }

}
