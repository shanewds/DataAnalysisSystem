package com.syiaas.utils;

import com.syiaas.pojo.SumdayOrder;

public class LineChartUtil implements Comparable{
        private String name;
        private String type;
        private Integer symbolSize;
        private int[] data=new int[8];
        
        
        
		public LineChartUtil(String name, String type, Integer symbolSize, int[] data) {
			super();
			this.name = name;
			this.type = type;
			this.symbolSize = symbolSize;
			this.data = data;
		}


		public LineChartUtil() {
			super();
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public Integer getSymbolSize() {
			return symbolSize;
		}
		public void setSymbolSize(Integer symbolSize) {
			this.symbolSize = symbolSize;
		}
		public int[] getData() {
			return data;
		}
		public void setData(int[] data) {
			this.data = data;
		}


		@Override
		public int compareTo(Object o) {
			     if(o instanceof LineChartUtil){
			    	LineChartUtil li = (LineChartUtil) o;
			    	return this.name.compareTo(li.getName());
		        }
		        throw new ClassCastException("不能转换为类型的对象...");
		}
        
        
        
        
}
