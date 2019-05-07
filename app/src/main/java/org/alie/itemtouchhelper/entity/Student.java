package org.alie.itemtouchhelper.entity;

/**
 * Created by Alie on 2019/5/6.
 * 类描述
 * 版本
 */
public class Student {
    private int logo;
    private String title;
    private String content;

    public Student() {
    }

    public Student(int logo, String title, String content) {
        this.logo = logo;
        this.title = title;
        this.content = content;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
