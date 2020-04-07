package org.ex11.vo;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Customer_ implements Serializable {
    private int id;
    private String account;
    private String passwd;
    private String truename;
    private String sex;
    private Integer age;
    private String tel;
    private Set address=new HashSet<>();

    public Set getAddress() {
        return address;
    }

    public void setAddress(Set address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }


    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer_ customer_ = (Customer_) o;

        if (id != customer_.id) return false;
        if (account != null ? !account.equals(customer_.account) : customer_.account != null) return false;
        if (passwd != null ? !passwd.equals(customer_.passwd) : customer_.passwd != null) return false;
        if (truename != null ? !truename.equals(customer_.truename) : customer_.truename != null) return false;
        if (sex != null ? !sex.equals(customer_.sex) : customer_.sex != null) return false;
        if (age != null ? !age.equals(customer_.age) : customer_.age != null) return false;
        if (tel != null ? !tel.equals(customer_.tel) : customer_.tel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (passwd != null ? passwd.hashCode() : 0);
        result = 31 * result + (truename != null ? truename.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        return result;
    }
}
