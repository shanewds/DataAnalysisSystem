package com.syiaas.utils;

public class YearMonthDayUtil {
   
	
	/*
	 * 判断是否是闰年  
	 * 2月闰年29天,不是闰年就是28天.
	 */
	public static int getFebruaryDay(int year){
		
		  
		    if(year%4==0 && year%100!=0 || year%400==0){
			    return 29;
		    }
		    return 28;

	}
	//1、3、5、7、8、10、12月每月31天
	//4 6 9 11  三十天每月.
	 public static int getFebruaryDay(int  month,int year){
	    if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
		    return 31;
	    }else if(month==2){
	    	return YearMonthDayUtil.getFebruaryDay(year);
	    }
	    return 30;

   }
	
	
	
	
	 
}
