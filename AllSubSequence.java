/**
 * 
 */
package com.alg.top20.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author sudha
 *
 */
public class AllSubSequence {

	static void subsequence(String s) {

		int index = -1;
		String curr = "";
		auxSubSeq(s, s.length(), index, curr);

	}

	private static void auxSubSeq(String s, int n, int index, String curr) {
		if (index == n) {
			return;
		}
		System.out.println(curr+ ":" +auxPolindrom(curr));
		for (int i = index + 1; i < n; i++) {
			curr = curr + s.charAt(i);
			auxSubSeq(s, n, i, curr);
			curr = curr.substring(0, curr.length() - 1);
		}

	}

	private static void polindrom(String[] str){

	for (int i=0;i<str.length;i++){
	  auxPolindrom(str[i]);
	}
	}

	private static boolean auxPolindrom(String s){

	for(int i=0,j=s.length()-1;i< s.length() ; i++,j--){

	   if(i==j){
	    return true;
	   }
	   if(s.charAt(i)==s.charAt(j)){

	   }else{
	       return false;
	     }
	  }
	return true;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sb = br.readLine();
		
		int l= sb.length();
		
		//String[] s = new String[l*l];

		subsequence(sb);

	}

}

/*
 * a b c d ab ac ad bc bd cd abc abd acd bcd abcd
 */




