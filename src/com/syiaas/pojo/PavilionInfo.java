package com.syiaas.pojo;

import java.io.Serializable;
public class PavilionInfo implements Serializable{

	private Long id; // չ����Ϣ���
	private String name; // չ������
	private Long exhibitionid; // ������չ
	private Long matchid; // ������չ
	private Integer exhibitorsnum; // չ����
	private Integer peoplenum; // �������
	private Double area; // �����
	private Double netarea; // �����
	private String contacts; // ��ϵ��
	private Long telephone; // ��ϵ�绰
	private String email; // ����
	private String desp; // ˵��
    
	
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
