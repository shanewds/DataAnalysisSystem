package com.syiaas.pojo;

public class Wuser {
	private Long id;

	private String username;

	private Long phone;

	private String recode;

	private Long exhibitionid;
    
	private Long time;
	
	private String mac;
	

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getRecode() {
		return recode;
	}

	public void setRecode(String recode) {
		this.recode = recode;
	}

	public Long getExhibitionid() {
		return exhibitionid;
	}

	public void setExhibitionid(Long exhibitionid) {
		this.exhibitionid = exhibitionid;
	}

}