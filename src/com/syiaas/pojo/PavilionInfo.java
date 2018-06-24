package com.syiaas.pojo;

import java.io.Serializable;
public class PavilionInfo implements Serializable{

	private Long id; // 展馆信息编号
	private String name; // 展馆名称
	private Long exhibitionid; // 隶属会展
	private Long matchid; // 隶属会展
	private Integer exhibitorsnum; // 展商数
	private Integer peoplenum; // 额定总人数
	private Double area; // 总面积
	private Double netarea; // 净面积
	private String contacts; // 联系人
	private Long telephone; // 联系电话
	private String email; // 邮箱
	private String desp; // 说明
    
	
	public Long getMatchid() {
		return matchid;
	}

	public void setMatchid(Long matchid) {
		this.matchid = matchid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getExhibitionid() {
		return exhibitionid;
	}

	public void setExhibitionid(Long exhibitionid) {
		this.exhibitionid = exhibitionid;
	}

	public Integer getExhibitorsnum() {
		return exhibitorsnum;
	}

	public void setExhibitorsnum(Integer exhibitorsnum) {
		this.exhibitorsnum = exhibitorsnum;
	}
	
	public Integer getPeoplenum() {
		return peoplenum;
	}

	public void setPeoplenum(Integer peoplenum) {
		this.peoplenum = peoplenum;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getNetarea() {
		return netarea;
	}

	public void setNetarea(Double netarea) {
		this.netarea = netarea;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	@Override
	public String toString() {
		return "PavilionInfo [id=" + id + ", name=" + name + ", exhibitionid="
				+ exhibitionid + ", exhibitorsnum=" + exhibitorsnum
				+ ", peoplenum=" + peoplenum + ", area=" + area + ", netarea="
				+ netarea + ", contacts=" + contacts + ", telephone="
				+ telephone + ", email=" + email + ", desp=" + desp + "]";
	}
    
}
