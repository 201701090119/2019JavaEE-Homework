package ex1.vo;

import javax.persistence.*;
import java.io.Serializable;


public class Student implements Serializable {
    private Integer stuId;
    private Integer stuNo;
    private String stuName;
    private String stuGender;
    private Integer stuAge;
    private Integer stuClassId;


    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }


    public Integer getStuNo() {
        return stuNo;
    }

    public void setStuNo(Integer stuNo) {
        this.stuNo = stuNo;
    }


    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuClassId() {
        return stuClassId;
    }

    public void setStuClassId(Integer stuClassId) {
        this.stuClassId = stuClassId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (stuId != student.stuId) return false;
        if (stuNo != null ? !stuNo.equals(student.stuNo) : student.stuNo != null) return false;
        if (stuName != null ? !stuName.equals(student.stuName) : student.stuName != null) return false;
        if (stuGender != null ? !stuGender.equals(student.stuGender) : student.stuGender != null) return false;
        if (stuAge != null ? !stuAge.equals(student.stuAge) : student.stuAge != null) return false;
        if (stuClassId != null ? !stuClassId.equals(student.stuClassId) : student.stuClassId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stuId;
        result = 31 * result + (stuNo != null ? stuNo.hashCode() : 0);
        result = 31 * result + (stuName != null ? stuName.hashCode() : 0);
        result = 31 * result + (stuGender != null ? stuGender.hashCode() : 0);
        result = 31 * result + (stuAge != null ? stuAge.hashCode() : 0);
        result = 31 * result + (stuClassId != null ? stuClassId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", stuNo=" + stuNo +
                ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' +
                ", stuAge=" + stuAge +
                ", stuClassId=" + stuClassId +
                '}';
    }
}
