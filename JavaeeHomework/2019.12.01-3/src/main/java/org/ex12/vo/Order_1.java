package org.ex12.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


public class Order_1 implements Serializable {
    private int oid;
    private Timestamp oDate;
    private String oName;
    private Integer oPrice;
    private Set products=new HashSet();

    public Set getProducts() {
        return products;
    }

    public void setProducts(Set products) {
        this.products = products;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public Timestamp getoDate() {
        return oDate;
    }

    public void setoDate(Timestamp oDate) {
        this.oDate = oDate;
    }


    public String getoName() {
        return oName;
    }

    public void setoName(String oName) {
        this.oName = oName;
    }



    public Integer getoPrice() {
        return oPrice;
    }

    public void setoPrice(Integer oPrice) {
        this.oPrice = oPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order_1 order_1 = (Order_1) o;

        if (oid != order_1.oid) return false;
        if (oDate != null ? !oDate.equals(order_1.oDate) : order_1.oDate != null) return false;
        if (oName != null ? !oName.equals(order_1.oName) : order_1.oName != null) return false;
        if (oPrice != null ? !oPrice.equals(order_1.oPrice) : order_1.oPrice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = oid;
        result = 31 * result + (oDate != null ? oDate.hashCode() : 0);
        result = 31 * result + (oName != null ? oName.hashCode() : 0);
        result = 31 * result + (oPrice != null ? oPrice.hashCode() : 0);
        return result;
    }
}
