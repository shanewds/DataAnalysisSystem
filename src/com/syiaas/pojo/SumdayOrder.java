package com.syiaas.pojo;

public class SumdayOrder implements Comparable{
 
    private int pavilionid;
    private String date;
    private int pavilionflow;
    private int exhibitorflow;
    private double percent;
    
    
    
    
	public SumdayOrder(String date, int pavilionflow, int exhibitorflow, double percent) {
		super();
		this.date = date;
		this.pavilionflow = pavilionflow;
		this.exhibitorflow = exhibitorflow;
		this.percent = percent;
	}
	public SumdayOrder(int pavilionid, String date, int pavilionflow, int exhibitorflow, double percent) {
		super();
		this.pavilionid = pavilionid;
		this.date = date;
		this.pavilionflow = pavilionflow;
		this.exhibitorflow = exhibitorflow;
		this.percent = percent;
	}
	public SumdayOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getPavilionid() {
		return pavilionid;
	}
	public void setPavilionid(int pavilionid) {
		this.pavilionid = pavilionid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getPavilionflow() {
		return pavilionflow;
	}
	public void setPavilionflow(int pavilionflow) {
		this.pavilionflow = pavilionflow;
	}
	public int getExhibitorflow() {
		return exhibitorflow;
	}
	public void setExhibitorflow(int exhibitorflow) {
		this.exhibitorflow = exhibitorflow;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	@Override
	public int compareTo(Object o) {
		   if(o instanceof SumdayOrder){
			   SumdayOrder sum = (SumdayOrder) o;
	            return this.date.compareTo(sum.getDate());
	        }
	        throw new ClassCastException("不能转换为类型的对象...");
	}
    
    
    
    
}