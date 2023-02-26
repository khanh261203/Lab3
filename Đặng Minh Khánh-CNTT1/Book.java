/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author ADMIN
 */
public class Book {
   private String boCode;
   private String boTitle;
   private String boAuthor;

   public Book() {
   }

   public Book(String boCode, String boTitle, String boAuthor) {
      this.boCode = boCode;
      this.boTitle = boTitle;
      this.boAuthor = boAuthor;
   }

   public Book(Book bo) {
      this.boCode = bo.boCode;
      this.boTitle = bo.boTitle;
      this.boAuthor = bo.boAuthor;
   }

   public String getboCode() {
      return boCode;
   }

   public String getBoTitle() {
      return boTitle;
   }

   public String getBoAuthor() {
      return boAuthor;
   }

   public void setboCode(String code) {
      this.boCode = code;
   }

   public void setBoTitle(String title) {
      this.boTitle = title;
   }

   public void setBoAuthor(String author) {
      this.boAuthor = author;
   }

   @Override
   public String toString() {
      return "Book [boCode=" + boCode + ", boTitle=" + boTitle + ", boAuthor=" + boAuthor + "]";
   }
}

