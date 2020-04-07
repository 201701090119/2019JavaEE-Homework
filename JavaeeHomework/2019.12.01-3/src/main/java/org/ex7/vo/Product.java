package org.ex7.vo;


import java.io.Serializable;


public class Product implements Serializable {
    private int pid;
    private String pName;
    private Integer pPrice;
    private String pDescription;
    private ProductType productType;


    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
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

        Product product = (Product) o;

        if (pid != product.pid) return false;
        if (pName != null ? !pName.equals(product.pName) : product.pName != null) return false;
        if (pPrice != null ? !pPrice.equals(product.pPrice) : product.pPrice != null) return false;
        if (pDescription != null ? !pDescription.equals(product.pDescription) : product.pDescription != null)
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
