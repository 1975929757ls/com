package com.project.daomain;

public class Information {
    private String info;
    private String author;
    private Integer love;
    private Integer zan;
    private Integer id;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getLove() {
        return love;
    }

    public void setLike(Integer love) {
        this.love = love;
    }

    public Integer getZan() {
        return zan;
    }

    public void setZan(Integer zan) {
        this.zan = zan;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Information{" +
                "info='" + info + '\'' +
                ", author='" + author + '\'' +
                ", love=" + love +
                ", zan=" + zan +
                ", id=" + id +
                '}';
    }
}
