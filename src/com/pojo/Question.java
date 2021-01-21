package com.pojo;

/**
 *功能描述:<br>
 *<试题类>
 *@Param:
 *@Return:
 *@Author:WBW
 *@Date:2021/1/21 11:07
 */

public class Question {
    private String id;
    private int type;
    private String subject;
    private String stem;
    private String answer;
    private int score;
    private String acc;
    private String createtime;
    private int isdelete;

    public Question() {
    }

    public Question(String id, int type, String subject, String stem, String answer, int score, String acc, String createtime, int isdelete) {
        this.id = id;
        this.type = type;
        this.subject = subject;
        this.stem = stem;
        this.answer = answer;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
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
        return "Question{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", subject='" + subject + '\'' +
                ", stem='" + stem + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                ", acc='" + acc + '\'' +
                ", createtime='" + createtime + '\'' +
                ", isdelete=" + isdelete +
                '}';
    }
}
