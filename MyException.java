package com;

public class MyException extends Exception {
		String str;
		MyException(String v)
		{
			str=v;
		}
		public String toString()
		{
			return ("Policy Number "+str+" is expired");
		}


	}

