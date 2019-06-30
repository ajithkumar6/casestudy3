package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.omg.CORBA.DynAnyPackage.Invalid;

public class test {





public static void main(String... args)
{

String filename="INPUT.txt";
List<Insurance> list= read_file(filename);

int choice;
Scanner scanner= new Scanner(System.in);
System.out.println("Enter your choice \n 1. Find expired policy details\n 2. Find Policy cost per vendor");
choice=scanner.nextInt();



if(choice==1)
   {
for(Insurance i : list)
{
Date cd = new Date();
SimpleDateFormat d  = new SimpleDateFormat("dd/MM/yyyy");

Date s;
try {
s = d.parse(i.getDate_of_expiry());


if(s.getTime() >= cd.getTime()){

}else
{
    
  throw new Invalid(); 
}

} catch (ParseException | Invalid e) {
// TODO Auto-generated catch block
System.out.println("policy No"+" "+ i.getPolicy_no()+ " " +"is expired");
}

}
   }


else if(choice==2)
{

for(Insurance j : list)
{
j.setPolicy_no(j.getPolicy_no().substring(0, 2));
}
Map<String, Integer> sum = list.stream().collect(
       Collectors.groupingBy(Insurance::getPolicy_no, Collectors.summingInt(Insurance::getCost_of_policy)));
System.out.println(sum);
}



else
        System.out.println("Invalid Option");
        



} 

public static List<Insurance> read_file(String a)
{List<Insurance> ins =new ArrayList<>();
try
{


BufferedReader br = new BufferedReader (new FileReader(a));

String line;
line=br.readLine();
while(line!=null)
{
String[] attr = line.split(" ");
Insurance obj = new Insurance(attr[0],Integer.parseInt(attr[1]),attr[2],attr[3],attr[4],attr[5]);
ins.add(obj);
line=br.readLine();

}
br.close();
}
catch(IOException ioe)
{
ioe.printStackTrace();
}

return ins;

}
}

