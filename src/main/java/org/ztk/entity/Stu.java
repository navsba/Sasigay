package org.ztk.entity;

import java.sql.Date;
import java.util.List;

public class Stu {
    private int stuid;
    private String stuname;
    private Date stubirthday;
    private String stuhobby;
    private int stuage;
    private int gradeid;
    private String pwd;
    private String imgpath;

    private List<Course> courseList;


    @Override
    public String toString() {
        return "Stu{" +
                "stuid=" + stuid +
                ", stuname='" + stuname + '\'' +
                ", stubirthday=" + stubirthday +
                ", stuhobby='" + stuhobby + '\'' +
                ", stuage=" + stuage +
                ", gradeid=" + gradeid +
                ", pwd='" + pwd + '\'' +
                ", imgpath='" + imgpath + '\'' +
                ", courseList=" + courseList +
                '}';
    }


    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Stu(int stuid, String stuname, Date stubirthday, String stuhobby, int stuage, int gradeid, String pwd, String imgpath, List<Course> courseList) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stubirthday = stubirthday;
        this.stuhobby = stuhobby;
        this.stuage = stuage;
        this.gradeid = gradeid;
        this.pwd = pwd;
        this.imgpath = imgpath;
        this.courseList = courseList;
    }

    public Stu() {
    }

    public Stu(int stuid, String stuname, Date stubirthday, String stuhobby, int stuage, int gradeid, String pwd, String imgpath) {
        this.stuid = stuid;
        this.stuname = stuname;
        this.stubirthday = stubirthday;
        this.stuhobby = stuhobby;
        this.stuage = stuage;
        this.gradeid = gradeid;
        this.pwd = pwd;
        this.imgpath = imgpath;
    }

    public Stu(String stuname, Date stubirthday, String stuhobby, int stuage, int gradeid, String pwd, String imgpath) {
        this.stuname = stuname;
        this.stubirthday = stubirthday;
        this.stuhobby = stuhobby;
        this.stuage = stuage;
        this.gradeid = gradeid;
        this.pwd = pwd;
        this.imgpath = imgpath;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public Date getStubirthday() {
        return stubirthday;
    }

    public void setStubirthday(Date stubirthday) {
        this.stubirthday = stubirthday;
    }

    public String getStuhobby() {
        return stuhobby;
    }

    public void setStuhobby(String stuhobby) {
        this.stuhobby = stuhobby;
    }

    public int getStuage() {
        return stuage;
    }

    public void setStuage(int stuage) {
        this.stuage = stuage;
    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }
}
