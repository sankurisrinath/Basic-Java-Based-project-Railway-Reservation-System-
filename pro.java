//package project;
//import cancellation.Cancellation;
import java.util.*;
import java.io.*;
//import reservation.Reservation;

class Display extends Main{
Display(){
System.out.println(" \t\t\t\t\t WELCOME TO AMEERPET RAILWAY STATION  ");
System.out.println(" \t\t\t\t\t Train no 131093 : AMEERPET   TO  THIRUPATHI");
System.out.println("\t\t\t Train schedule timings: 3:30 pm  2nd Feb,2022");
  String line1;
try{
  BufferedReader bin1=new BufferedReader(new FileReader("C://java programs//first.txt"));
if(!bin1.ready())
throw new IOException();
 
       while((line1=bin1.readLine())!=null)
{
al1.add(line1);
}
bin1.close();
}catch (Exception e){
e.printStackTrace();
}


  String line2;
try{
  BufferedReader bin2=new BufferedReader(new FileReader("C://java programs//second.txt"));
if(!bin2.ready())
     throw new IOException();
 
       while((line2=bin2.readLine())!=null)
{
 al2.add(line2);
}
bin2.close();
}catch (Exception e){
e.printStackTrace();
}

  String line3;
try{
  BufferedReader bin3=new BufferedReader(new FileReader("C://java programs//third.txt"));
if(!bin3.ready())
     throw new IOException();
 
       while((line3=bin3.readLine())!=null)
{
 al3.add(line3);
}
bin3.close();
}catch (Exception e){
e.printStackTrace();
}
System.out.print("seats available in FIRST CLASS:   ");
System.out.println(al1);
System.out.print("seats available in SECOND CLASS:   ");
System.out.println(al2);
System.out.print("seats available in THIRD CLASS:   ");
System.out.println(al3);
}}

class  Main{
ArrayList<Object>al1=new ArrayList<Object>();
ArrayList<Object>al2=new ArrayList<Object>();
ArrayList <Object>al3=new ArrayList<Object>();
public static void main(String args[]){
Display d=new Display();
//Reservation r=new Reservation();
//Cancellation c=new Cancellation();
}}