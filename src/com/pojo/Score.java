package com.pojo;

/**
 * @author xhz
 * @description 成绩表对象
 * @date 2021-01-25
 */
public class Score {
    private String id;
    private String stuName;
    private int stuScore;
    private String subject;
    private String examName;
    private String author;
    private String createTime;
    private int isDelete;

    public Score() {
    }

    public Score(String id, String stuName, int stuScore, String subject, String examName, String author, String createTime, int isDelete) {
        this.id = id;
        this.stuName = stuName;
        this.stuScore = stuScore;
        this.subject = subject;
        this.examName = examName;
        this.author = author;
        this.createTime = createTime;
        this.isDelete = isDelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuScore() {
        return stuScore;
    }

    public void setStuScore(int stuScore) {
        this.stuScore = stuScore;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) {
        this.examName = examName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id='" + id + '\'' +
                ", stuName=" + stuName +
                ", stuScore='" + stuScore + '\'' +
                ", subject='" + subject + '\'' +
                ", examName='" + examName + '\'' +
                ", author='" + author + '\'' +
                ", createTime='" + createTime + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}
