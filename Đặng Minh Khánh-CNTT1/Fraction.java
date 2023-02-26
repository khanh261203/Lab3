/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author ADMIN
 */

public class Fraction {
    int numerator;
    int denominator;
   
    
    public Fraction(){}
    public Fraction(int num, int den){
        this.numerator=num;
        this.denominator=den;
    }
    public Fraction(Fraction f){
        this.numerator=f.numerator;
        this.denominator=f.denominator;
    }
    public Fraction Add(Fraction f){
        int new_numerator=this.numerator*f.this.denominator+f.numerator*this.denominator;
        int new_denominator=this.denominator*f.denominator;
        return new Fraction(new_numerator,new_denominator);
    }
    public Fraction Sub(Fraction f){
        int new_numerator=this.numerator*f.this.denominator-f.numerator*this.denominator;
        int new_denominator=this.denominator*f.denominator;
        return new Fraction(new_numerator,new_denominator);
    }
    public Fraction mul(Fraction f){
        int new_numerator=this.numerator*f.numerator;
        int new_denominator=this.denominator*f.denominator;
        return new Fraction(new_numerator,new_denominator);
    }
    public Fraction div(Fraction f){
        int new_numerator=this.numerator*f.this.denominator
        int new_denominator=this.denominator*f.numerator;
        return new Fraction(new_numerator,new_denominator);
    }
    public void reducer(){
        int n=numerator;
        int m=denominator;
        if (n < m)
    {
        int tmp = n;
        n = m;
        m = tmp;
    }

    while (m > 0)
    {
        int tmp = n % m;
        n = m;
        m = tmp;
    }
        numerator/=n;
        denominator/=n;
    }
public String toString() {
        return numerator + "/" + denominator;
    }    
}
