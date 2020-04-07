package org.ex12.vo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Product_1 implements Serializable {
    private int pid;
    private String pName;
    private Integer pPrice;
    private String pDescription;
    private Set orders=new HashSet();

    public Set getOrders() {
        return orders;
    }

    public void setOrders(Set orders) {
        this.orders = orders;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }


    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }


    public Integer getpPrice() {
        return pPrice;
    }

    public void setpPrice(Integer pPrice) {
        this.pPrice = pPrice;
    }


    public String getpDescription() {
        return pDescription;
    }

    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product_1 product_1 = (Product_1) o;

        if (pid != product_1.pid) return false;
        if (pName != null ? !pName.equals(product_1.pName) : product_1.pName != null) return false;
        if (pPrice != null ? !pPrice.equals(product_1.pPrice) : product_1.pPrice != null) return false;
        if (pDescription != null ? !pDescription.equals(product_1.pDescription) : product_1.pDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + (pName != null ? pName.hashCode() : 0);
        result = 31 * result + (pPrice != null ? pPrice.hashCode() : 0);
        result = 31 * result + (pDescription != null ? pDescription.hashCode() : 0);
        return result;
    }
}
