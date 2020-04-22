package com.bw.bean;

public class T_heros {
	private int hid;
	private String name;
	private double price;
	private String uptime;
	private int status;
	private T_camp t_camp;
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public T_camp getT_camp() {
		return t_camp;
	}
	public void setT_camp(T_camp t_camp) {
		this.t_camp = t_camp;
	}
	public T_heros(int hid, String name, double price, String uptime, int status, T_camp t_camp) {
		super();
		this.hid = hid;
		this.name = name;
		this.price = price;
		this.uptime = uptime;
		this.status = status;
		this.t_camp = t_camp;
	}
	public T_heros() {
	
	}
	@Override
	public String toString() {
		return "T_heros [hid=" + hid + ", name=" + name + ", price=" + price + ", uptime=" + uptime + ", status="
				+ status + ", t_camp=" + t_camp + "]";
	}
	
}
