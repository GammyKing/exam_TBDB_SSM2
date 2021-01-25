package com.pojo;

/**
 * @author xhz
 * @description 试卷对象
 * @date 2021-01-23
 */
public class Paper {
    private String id;
    private int type;
    private String subject;
    private String stem;
    private String answer;
    private String acc;
    private int Score;
    private String examname;
    private String createtime;
    private String isdelete;

    public Paper() {
    }

    public Paper(String id, int type, String subject, String stem, String answer, String acc, int score, String examname, String createtime, String isdelete) {
        this.id = id;
        this.type = type;
        this.subject = subject;
        this.stem = stem;
        this.answer = answer;
        this.acc = acc;
        Score = score;
        this.examname = examname;
        this.createtime = createtime;
        this.isdelete = isdelete;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getStem() {
        return stem;
    }

    public void setStem(String stem) {
        this.stem = stem;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getExamname() {
        return examname;
    }

    public void setExamname(String examname) {
        this.examname = examname;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    @Override
    public String toString() {
        return "Paper{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", subject='" + subject + '\'' +
                ", stem='" + stem + '\'' +
                ", answer='" + answer + '\'' +
                ", acc='" + acc + '\'' +
                ", Score=" + Score +
                ", examname='" + examname + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isdelete='" + isdelete + '\'' +
                '}';
    }
}
