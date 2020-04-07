package org.ex11.vo;

import javax.persistence.*;


public class Address_ {
    private int id;
    private String nation;
    private String province;
    private String city;
    private String description;
    private String code;
    private Integer custId;
    private Customer_ customer_;

    public Customer_ getCustomer_() {
        return customer_;
    }

    public void setCustomer_(Customer_ customer_) {
        this.customer_ = customer_;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address_ address_ = (Address_) o;

        if (id != address_.id) return false;
        if (nation != null ? !nation.equals(address_.nation) : address_.nation != null) return false;
        if (province != null ? !province.equals(address_.province) : address_.province != null) return false;
        if (city != null ? !city.equals(address_.city) : address_.city != null) return false;
        if (description != null ? !description.equals(address_.description) : address_.description != null)
            return false;
        if (code != null ? !code.equals(address_.code) : address_.code != null) return false;
        if (custId != null ? !custId.equals(address_.custId) : address_.custId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nation != null ? nation.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (custId != null ? custId.hashCode() : 0);
        return result;
    }
}
