package com.webservice.service;

import java.util.Arrays;

import javax.jws.WebService;

@WebService
public class Fibonnaci {
	
	public Fibonnaci() { 
	}
	
	public int getFibonnaci(int n){
		int first = 1, second = 1;
		while(n>0){
			int temp = second;
			second = first+second;
			first = temp;
			n--;
		}
		return second;
	}
	
}
