package com.spring.app;

import java.util.Map;

public class CurrencyConverter {
	
	private Map<String,String> mObj;
    
    public void setMObj(Map<String,String> mObj){
        this.mObj=mObj;
    }
    public Map<String,String> getMObj(){
        return mObj;
    }
	
	    public int getTotalCurrencyValue(String value)
    	{
	    Integer total=0;
	    char ar[]=value.toCharArray();
	    String val1="";
	    int i=0;
	    while((int)ar[i]>=48 && (int)ar[i]<=57)
	    {
	        val1=val1+ar[i];
	        i++;
	    }
            int a=Integer.parseInt(val1);
            String val=value.substring(i);
            total=a*Integer.parseInt(mObj.get(val.toUpperCase()));
            return total;
	    	    
	    }	
	
		    	    	     	      	 	

}
