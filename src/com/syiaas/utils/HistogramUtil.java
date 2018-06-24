package com.syiaas.utils;

import java.util.ArrayList;
import java.util.List;

import com.syiaas.pojo.Sumday;
import com.syiaas.pojo.SumdayOrder;

public class HistogramUtil {

	private int sumPavilionflow;
	private int avgSumPavilionflow;
	private int exhibitorflow;
	private int avgExhibitorflow;
	private double avgPercent;
	private List<SumdayOrder> sumDays = new ArrayList<SumdayOrder>();
	
	
	
	public HistogramUtil() {
		super();
	}

    
 
	public HistogramUtil(int sumPavilionflow, int avgSumPavilionflow, int exhibitorflow, int avgExhibitorflow,
			double avgPercent, List<SumdayOrder> sumDays) {
		super();
		this.sumPavilionflow = sumPavilionflow;
		this.avgSumPavilionflow = avgSumPavilionflow;
		this.exhibitorflow = exhibitorflow;
		this.avgExhibitorflow = avgExhibitorflow;
		this.avgPercent = avgPercent;
		this.sumDays = sumDays;
	}



	public int getSumPavilionflow() {
		return sumPavilionflow;
	}



	public void setSumPavilionflow(int sumPavilionflow) {
		this.sumPavilionflow = sumPavilionflow;
	}



	public int getAvgSumPavilionflow() {
		return avgSumPavilionflow;
	}



	public void setAvgSumPavilionflow(int avgSumPavilionflow) {
		this.avgSumPavilionflow = avgSumPavilionflow;
	}



	public int getExhibitorflow() {
		return exhibitorflow;
	}



	public void setExhibitorflow(int exhibitorflow) {
		this.exhibitorflow = exhibitorflow;
	}



	public int getAvgExhibitorflow() {
		return avgExhibitorflow;
	}



	public void setAvgExhibitorflow(int avgExhibitorflow) {
		this.avgExhibitorflow = avgExhibitorflow;
	}



	public double getAvgPercent() {
		return avgPercent;
	}



	public void setAvgPercent(double avgPercent) {
		this.avgPercent = avgPercent;
	}



	public List<SumdayOrder> getSumDays() {
		return sumDays;
	}



	public void setSumDays(List<SumdayOrder> sumDays) {
		this.sumDays = sumDays;
	}



	
}
