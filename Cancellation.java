
import java.util.*;
import java.io.*;

public class Cancellation{
public Cancellation(){

System.out.println("\n\n\n\t\t\t\tEnter your ticketing details    \n");
            System.out.println("\t\t\t\t press 4 for cancellation of FIRST CLASS reservation \n\t\t\t\t press 5  for cancellation of SECOND CLASS reservation\n\t\t\t\tpress 6 cancellation of THIRD CLASS reservation:");
            Scanner s=new Scanner(System.in);
	int i=s.nextInt();
            switch(i)
            {
                case 4:
                {
ArrayList<Object> al=new ArrayList<Object>();
  String line1;
try{
  BufferedReader bin1=new BufferedReader(new FileReader("C://java programs//first.txt"));
if(!bin1.ready())
     throw new IOException();
 
       while((line1=bin1.readLine())!=null)
{
 al.add(line1);
}
bin1.close();
}catch (Exception e){
e.printStackTrace();
}


                   System.out.println("\t\t\t\t\tEnter your seat number:");
                   Object b=s.next();
                   System.out.println("Are you sure you want to cancel your seat!?---(Y or N) ");               
String c=s.next();
                  if(c.equalsIgnoreCase("y"))
                  {
                    System.out.println("\t\t\t\t Your reservation in FIRST CLASS has been cancelled successfully--\n\n\n\t\t\t\t\tTHANK YOU   ")  ;
                  
al.add(b);
try{
    FileWriter fw=new FileWriter("C://java programs//first.txt");
Writer output= new BufferedWriter(fw);
int sz=al.size();
for(int io=0;io<sz;io++){
output.write(al.get(io).toString()+"\n");}
output.close();
}catch(Exception e)
{System.out.println(e);
}

	}
                 else
                 {
                   System.out.println("\t\t\t\t\tYour reservation has not been cancelled, THANK YOU!");
                 }
                 break;
                }
               case 5:
                {
ArrayList<Object> al=new ArrayList<Object>();
String line2;
try{
  BufferedReader bin2=new BufferedReader(new FileReader("C://java programs//second.txt"));
if(!bin2.ready())
     throw new IOException();
 
       while((line2=bin2.readLine())!=null)
{
 al.add(line2);
}
bin2.close();
}catch (Exception e){
e.printStackTrace();
}

                   System.out.println("\t\t\t\t\tEnter your seat number:");
                   Object e=s.next();
                   System.out.println("Are you sure you want to cancel your seat!?---(Y or N) ");
	String d=s.next();
                   if(d.equalsIgnoreCase("y"))
                  {
                   System.out.println("\t\t\t\t Your reservation in SECOND CLASS has been cancelled successfully--\n\n\n\t\t\t\t\tTHANK YOU   ")  ;
            al.add(e);
try{
FileWriter fw=new FileWriter("C://java programs//second.txt");
Writer output= new BufferedWriter(fw);
int sz=al.size();
for(int k=0;k<sz;k++){
output.write(al.get(k).toString()+"\n");}
output.close();
}catch(Exception ed)
{System.out.println(ed);
}      

}
                else
                  {
                System.out.println("\t\t\t\t\tYour reservation has not been cancelled, THANK YOU!");
                  }
                 break;
                }
                 case 6:
ArrayList<Object> al=new ArrayList<Object>();
  String line3;
try{
  BufferedReader bin3=new BufferedReader(new FileReader("C://java programs//third.txt"));
if(!bin3.ready())
     throw new IOException();
 
       while((line3=bin3.readLine())!=null)
{
 al.add(line3);
}
bin3.close();
}catch (Exception e){
e.printStackTrace();
}

System.out.println("\t\t\t\t\tEnter your seat number:");
                   Object b=s.next();
                   System.out.println("Are you sure you want to cancel your seat!?---(Y or N) ");                 
String c=s.next();
                  if(c.equalsIgnoreCase("y"))
                  {
                    System.out.println("\t\t\t\t Your reservation in THIRD CLASS has been cancelled successfully--\n\n\n\t\t\t\t\tTHANK YOU   ")  ;
                  
 al.add(b);
try{
FileWriter fw=new FileWriter("C://java programs//third.txt");
Writer output= new BufferedWriter(fw);
int sz=al.size();
for(int f=0;f<sz;f++){
output.write(al.get(f).toString()+"\n");}
output.close();
}catch(Exception e)
{System.out.println(e);
}      
}
                 else
                 {
                   System.out.println("\t\t\t\t\tYour reservation has not been cancelled, THANK YOU!");
                 }
                 break;
                }

}

}
class Main{
public static void main(String args[]){
Cancellation c =new Cancellation();
}}


