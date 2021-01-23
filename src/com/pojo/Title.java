package com.pojo;

/**
 * @author xhz
 * @description 试卷名
 * @date 2021-01-23
 */
public class Title {
    private String id;
    private String acc;
    private String examname;
    private String examtime;
    private String starttime;
    private String endtime;
    private String createtime;
    private int isdelete;

    public Title() {
    }

    public Title(String id, String acc, String examname, String examtime, String starttime, String endtime, String createtime, int isdelete) {
        this.id = id;
        this.acc = acc;
        this.examname = examname;
        this.examtime = examtime;
        this.starttime = starttime;
        this.endtime = endtime;
        this.createtime = createtime;
        this.isdelete = isdelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname;
    }

    public String getExamtime() {
        return examtime;
    }

    public void setExamtime(String examtime) {
        this.examtime = examtime;
    }

    public String getStarttime() {
        return starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public int getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(int isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Title{" +
                "id='" + id + '\'' +
                ", acc='" + acc + '\'' +
                ", examname='" + examname + '\'' +
                ", examtime='" + examtime + '\'' +
                ", starttime='" + starttime + '\'' +
                ", endtime='" + endtime + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}
