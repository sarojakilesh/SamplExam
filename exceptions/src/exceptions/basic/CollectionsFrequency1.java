package exceptions.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsFrequency1 {
	 public static void main(String[] args) {  
	        //Create a list object         
	        List<String> arrlist = new ArrayList<String>();  
	        //Add elements in the list  
	        arrlist.add("Java");  
	        arrlist.add("COBOL");  
	          arrlist.add("Java");  
	          arrlist.add("Java");  
	        arrlist.add("Java");  
	        System.out.println("List of elements: "+arrlist);  
	        //Count the frequency of the given word      
	        System.out.println("Frequency of the Word: "+Collections.frequency(arrlist,"Java"));  
	        }       
	}  

