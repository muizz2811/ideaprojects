package com.company;

class xyz
{

    int a;
    xyz(int x)
    {

        a=x;
        System.out.println("x="+x);
    }
}
class pqr extends xyz
{

    int b;
    pqr(int x,int y)
    {
super(x);
        b=y;
        System.out.println("y="+y);
    }
}
class Main
{
    public static void main(String args[]){
        //Creating the object of child class
        pqr obj = new pqr(10,20);

    }}

