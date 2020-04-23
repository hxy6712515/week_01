package com.huxiaoyang.beans;

public class Hero {
	private Integer id;
	private String name;
	private Double price;
	private String uptime;
	private Integer status;
	private Integer cid;
	private String cname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(Integer id, String name, Double price, String uptime, Integer status, Integer cid, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.uptime = uptime;
		this.status = status;
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Heros [id=" + id + ", name=" + name + ", price=" + price + ", uptime=" + uptime + ", status=" + status
				+ ", cid=" + cid + ", cname=" + cname + "]";
	}

}
