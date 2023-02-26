/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author ADMIN
 */
public class Triangle {
    float width=0.0f;
    float hegth=0.0f;
    public Triangle(){}
    public Triangle(float width, float hegth){
        this.width=width;
        this.hegth=hegth;
    }
    public float getwidth(float width){
        return width;
    }
     public float gethegth(float hegth){
         
      return hegth;
         
     }
    public void setwidth(float wid){
        this.width=wid;
    }
    public void sethegth(float heg){
        this.hegth=heg;
    }
    public String toString(){
        return "Triangle" +this.width + this.hegth;
    }
}
