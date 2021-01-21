package com.pojo;
/**
 *功能描述:<br>
 *<对应数据库中题目类型表建立的pojo类>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 16:04
 */
public class QuestionType {
    private String id;
    private String subject;
    private String acc;
    private String createtime;
    private int isdelete;

    public QuestionType() {
    }

    public QuestionType(String id, String subject, String acc, String createtime, int isdelete) {
        this.id = id;
        this.subject = subject;
        this.acc = acc;
        this.createtime = createtime;
        this.isdelete = isdelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
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
        return "QuestionType{" +
                "id='" + id + '\'' +
                ", subject='" + subject + '\'' +
                ", acc='" + acc + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}
