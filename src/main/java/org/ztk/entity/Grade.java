package org.ztk.entity;

import java.util.List;

public class Grade {
    private int gid;
    private String gname;
    private List<Stu> stuList;

    @Override
    public String toString() {
        return "Grade{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", stuList=" + stuList +
                '}';
    }

    public List<Stu> getStuList() {
        return stuList;
    }

    public void setStuList(List<Stu> stuList) {
        this.stuList = stuList;
    }

    public Grade(int gid, String gname, List<Stu> stuList) {
        this.gid = gid;
        this.gname = gname;
        this.stuList = stuList;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Grade() {
    }

    public Grade(String gname, List<Stu> stuList) {
        this.gname = gname;
        this.stuList = stuList;
    }
}
