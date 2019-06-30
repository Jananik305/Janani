package com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

import java.text.ParseException;
import java.text.SimpleDateFormat; 
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		String n="C:\\Users\\User\\eclipse-workspace\\case study2\\input.txt";
		List<Pojo> list = readtxtfile(n);
		Policy(list);
		Expiry(list);
		
	}
	
	
	private static void Expiry(List<Pojo> a) {
		// TODO Auto-generated method stub
		for(Pojo i:a)
		{
			String b=i.getDischarge_date(); 
			String c=i.getExpiry_date();
			SimpleDateFormat sd=new SimpleDateFormat("dd/MM/yyyy"); 
			Date dis = null;
			try {
				dis = sd.parse(b);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			Date exp = null;
			try {
				exp = sd.parse(c);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				if(exp.before(dis))
				{
					String var=i.getPolicy_no();
				    throw new MyException(var);
				}
			}
			catch(MyException e) {
				System.out.println(e);}
		}
			
					
		 }
	


	private static void Policy(List<Pojo> list) {
		
		// TODO Auto-generated method stub
		
		    String a="";
		    String b="";

		for(Pojo i: list)
		{
			int sum=0;
			
		String s1=i.getPolicy_no().substring(0,2);

		for(Pojo j: list) {
			
		 a=j.getPolicy_no();
		 b=j.getMedical_specialist();


		if((a.contains(s1)) && (!b.contains("**"))) {
			 String ex=j.getCost();
			 int p=Integer.parseInt(ex);
			 j.setMedical_specialist("**");
		    sum+=p;
		}
		}
		if(!b.contains("**"))
		{
		System.out.println(s1+" "+sum);
		}


		}


		}
		
		
	

	private static List<Pojo> readtxtfile(String file)
	{
		List<Pojo> list1=new ArrayList<>();
		Path pathToFile=Paths.get(file);
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile,StandardCharsets.US_ASCII)){
		String line=br.readLine();
			while(line!=null)
			{
				String[] attributes=line.split(" ");
				Pojo obj= new Pojo(attributes[0],attributes[1],attributes[2],attributes[3],attributes[4],attributes[5]);
				list1.add(obj);
				line=br.readLine();
			}
		} catch(IOException e)
		{
			e.printStackTrace(); //it prints the error class and error line
		}
		return list1;
	}

}
		
		
		
		
	
	
	
			