import java.util.*;
import java.io.*;
import java.util.regex.*;
public class Reservation{
Reservation(){
System.out.println(" enter 1 for FIRST CLASS seat reservation\n2. for SECOND CLASS seat reservation\n3. for THIRD CLASS reservation");
Calendar c=Calendar.getInstance();
Scanner g= new Scanner(System.in);
int n=g.nextInt();
switch (n){
case 1:
{
         ArrayList<Object> al=new ArrayList<Object>();
String line;
try{
BufferedReader input=new BufferedReader(new FileReader("C://java programs//first.txt"));
if(!input.ready()){
throw new IOException();
}
while((line=input.readLine())!=null){
al.add(line);
}
input.close();
}
catch(IOException e){System.out.println(e);
}
Scanner s=new Scanner(System.in);
System.out.println(al);
System.out.println(" Enter the seat number you want to reserve in FIRST CLASS among vacancies displayed above:-");
Object t2=s.next();
          if(al.contains(t2))
    {
            System.out.println("\n\t\t\t\t      Your ticketing details          \n");
            System.out.println("\t\t\tYour Class: FIRST CLASS ");
            System.out.println("\n\t\t\tYour Seat Number:- \n\n"+t2);
            System.out.println("if you are satisified with the booking, press (okay)\n");
	String str=s.next();
            Pattern pat=Pattern.compile("okay"); 
            Matcher mat=pat.matcher(str);
	boolean found=mat.matches();
            if(found) 
            {
            System.out.print("Your ticket has been booked in FIRST CLASS on: "+c.getTime());
            System.out.println("\n\n\n\t\t\t THANK YOU   ");
            }
           else
              {System.out.print("Your ticket has not been booked in FIRST CLASS  ");
              System.exit(0);
               } 
	
}
         else
           {
               do
               {
                   System.out.println("seat "+t2+" is not available, aleady been booked\n check for available seats\n");
                   System.out.println("\t\t\t\t    available seats are: "+al);
	System.out.println("enter the seat number again:");
	System.out.print("seat:-");
                   t2=s.next();
	System.out.println(al.contains(t2));
               }while(!(al.contains(t2)));


System.out.println("\n\t\t\t\t      Your ticketing details          \n");
            System.out.println("\t\t\t\tYour Class: FIRST CLASS ");
            System.out.println("\n\t\t\tYour Seat Number:- "+t2);
            System.out.println("if you are satisified with the booking, press (okay)\n");
	System.out.print("key :-");
	String str=s.next();
            Pattern pat=Pattern.compile("okay"); 
            Matcher mat=pat.matcher(str);
	boolean found=mat.matches();
            if(found) 
            {
            System.out.println("\t\t\t\t\tYour ticket has been booked in FIRST CLASS on: "+c.getTime());
            System.out.println("\n\n\n\t\t\t THANK YOU   ");
            }
            else{
              System.exit(0);
System.out.println("boo");
}}
al.remove(al.indexOf(t2));
try{
FileWriter fw=new FileWriter("C://java programs//first.txt");
Writer output= new BufferedWriter(fw);
int sz=al.size();
for(int i=0;i<sz;i++){
output.write(al.get(i).toString()+"\n");}
output.close();
}catch(Exception e)
{System.out.println(e);
}

           }
             break;


case 2:
{
ArrayList<Object> al=new ArrayList<Object>();
String line;
try{
BufferedReader input=new BufferedReader(new FileReader("C://java programs//second.txt"));
if(!input.ready()){
throw new IOException();
}
while((line=input.readLine())!=null){
al.add(line);
}
input.close();
}
catch(IOException e){System.out.println(e);
}
System.out.println(al);
System.out.println(" Enter the seat number you want to reserve in SECOND CLASS among vacancies displayed above:-");
Scanner b=new Scanner (System.in);
Object a=b.next();
System.out.println(al.contains(a));
          if(al.contains(a))
    {
            System.out.println("\n\t\t\t\t      Your ticketing details          \n");
            System.out.println("\t\t\tYour Class: SECOND CLASS ");
            System.out.println("\n\t\t\tYour Seat Number:- \n\n"+a);
            System.out.println("if you are satisified with the booking, press (okay)\n");
	String str=b.next();
            Pattern pat=Pattern.compile("okay"); 
            Matcher mat=pat.matcher(str);
	boolean found=mat.matches();
            if(found) 
            {
            System.out.println("Your ticket has been booked in SECOND CLASS on: "+c.getTime());
            System.out.println("\n\n\n\t\t\t THANK YOU   ");
            }

	
}
         else
           {
               do
               {
                   System.out.println("seat "+a+" is not available, aleady been booked\n check for available seats\n");
                   System.out.println("\t\t\t\t    available seats are: "+al);
	System.out.println("enter the seat number again:");
                   a=b.next();
               }while(!al.contains(a));


System.out.println("\n\t\t\t\t      Your ticketing details          \n");
            System.out.println("\t\t\tYour Class: SECOND CLASS ");
            System.out.println("\n\t\t\tYour Seat Number:- \n\n"+a);
            System.out.println("if you are satisified with the booking, press (okay)\n");
	String str=b.next();
            Pattern pat=Pattern.compile("okay"); 
            Matcher mat=pat.matcher(str);
	boolean found=mat.matches();
            if(found) 
            {
            System.out.println("Your ticket has been booked in SECOND CLASS on: "+c.getTime());
            System.out.println("\n\n\n\t\t\t THANK YOU   ");
            }
}
al.remove(al.indexOf(a));
try{
FileWriter fw=new FileWriter("C://java programs//second.txt");
Writer output= new BufferedWriter(fw);
int sz=al.size();
for(int i=0;i<sz;i++){
output.write(al.get(i).toString()+"\n");}
output.close();
}catch(Exception e)
{System.out.println(e);
}

           }
            break;
case 3:
{
ArrayList<Object> al=new ArrayList<Object>();
String line;
try{
BufferedReader input=new BufferedReader(new FileReader("C://java programs//third.txt"));
if(!input.ready()){
throw new IOException();
}
while((line=input.readLine())!=null){
al.add(line);
}
input.close();
}
catch(IOException e){System.out.println(e);
}

System.out.println(" Enter the seat number you want to reserve in THIRD CLASS among vacancies displayed above:-");
Scanner b=new Scanner (System.in);
Object a=b.next();
          if(al.contains(a))
    {
            System.out.println("\n\t\t\t\t      Your ticketing details          \n");
            System.out.println("\t\t\tYour Class: THIRD CLASS ");
            System.out.println("\n\t\t\tYour Seat Number:- \n\n"+a);
            System.out.println("if you are satisified with the booking, press (okay)\n");
	String str=b.next();
            Pattern pat=Pattern.compile("okay"); 
            Matcher mat=pat.matcher(str);
	boolean found=mat.matches();
            if(found) 
            {
            System.out.println("Your ticket has been booked in THIRD CLASS on: "+c.getTime());
            System.out.println("\n\n\n\t\t\t THANK YOU   ");
            }

	
}
         else
           {
               do
               {
                   System.out.println("seat "+a+" is not available, aleady been booked\n check for available seats\n");
                   System.out.println("\t\t\t\t    available seats are: "+al);
	System.out.println("enter the seat number again:");
                   a=b.next();
               }while(!al.contains(a));


System.out.println("\n\t\t\t\t      Your ticketing details          \n");
            System.out.println("\t\t\tYour Class: THIRD CLASS ");
            System.out.println("\n\t\t\tYour Seat Number:- \n\n"+a);
            System.out.println("if you are satisified with the booking, press (okay)\n");
	String str=b.next();
            Pattern pat=Pattern.compile("okay"); 
            Matcher mat=pat.matcher(str);
	boolean found=mat.matches();
            if(found) 
            {
            System.out.println("Your ticket has been booked in THIRD CLASS on: "+c.getTime());
            System.out.println("\n\n\n\t\t\t THANK YOU   ");
            }
}

al.remove(al.indexOf(a));
try{
FileWriter fw=new FileWriter("C://java programs//third.txt");
Writer output= new BufferedWriter(fw);
int sz=al.size();
for(int i=0;i<sz;i++){
output.write(al.get(i).toString()+"\n");}
output.close();
}catch(Exception e)
{System.out.println(e);
}

           }
            break;
 } 

}}
class Main{
public static void main(String args[]){
Reservation r=new Reservation();
}}


