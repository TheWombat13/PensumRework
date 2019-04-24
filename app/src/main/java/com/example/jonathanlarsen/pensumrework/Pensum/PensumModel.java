package com.example.jonathanlarsen.pensumrework.Pensum;

public class PensumModel {

    private String title, teacher, comment;
    private int pages, pagesToGo;

    public PensumModel(){
    }

    public PensumModel(String title, String teacher, String comment, int pages, int pagesToGo){
        this.title = title;
        this.teacher = teacher;
        this.comment = comment;
        this.pages = pages;
        this.pagesToGo = pagesToGo;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getPagesToGo() {
        return pagesToGo;
    }

    public void setPagesToGo(int pagesToGo) {
        this.pagesToGo = pagesToGo;
    }
}
