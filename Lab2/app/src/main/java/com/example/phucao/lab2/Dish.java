package com.example.phucao.lab2;

public class Dish {

    private String name;
    private int img;
    private int pro;

    public Dish(String name,int img,int pro){
        this.name = name;
        this.img = img;
        this.pro = pro;
    }
    public String getName(){
        return name;
    }

    public int getImg(){
        return img;
    }
    public int getPro(){
        return pro;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setImg(int img) {
        this.img = img;
    }
    public void setPro(int pro) {
        this.pro = pro;
    }
}
