package org.ztk.entity;

public class Course {
    private int cid;
    private String cname;

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Course(int cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }
}
