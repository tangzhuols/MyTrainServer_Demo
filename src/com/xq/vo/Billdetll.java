package com.xq.vo;

public class Billdetll {//�˵������
	private int btid;
	private String btrdeTIme;
	private String bcourse;
	private float btrdeMoney;
	private float bmyMoney;
	private String bkImage;
	private String bkName;
	private String bkNumber;
	private String orderTime;
	private int sid;
	private int bstode;
	private Student_info si;
	public Billdetll() {
		super();
	}
	public Billdetll(String btrdeTIme, String bcourse, float btrdeMoney,
			float bmyMoney, String bkImage, String bkName, String bkNumber,
			String orderTime, int sid, Student_info si) {
		super();
		this.btrdeTIme = btrdeTIme;
		this.bcourse = bcourse;
		this.btrdeMoney = btrdeMoney;
		this.bmyMoney = bmyMoney;
		this.bkImage = bkImage;
		this.bkName = bkName;
		this.bkNumber = bkNumber;
		this.orderTime = orderTime;
		this.sid = sid;
		this.si = si;
	}
	public Billdetll(int btid, String btrdeTIme, String bcourse,
			float btrdeMoney, float bmyMoney, String bkImage, String bkName,
			String bkNumber, String orderTime, int sid, Student_info si) {
		super();
		this.btid = btid;
		this.btrdeTIme = btrdeTIme;
		this.bcourse = bcourse;
		this.btrdeMoney = btrdeMoney;
		this.bmyMoney = bmyMoney;
		this.bkImage = bkImage;
		this.bkName = bkName;
		this.bkNumber = bkNumber;
		this.orderTime = orderTime;
		this.sid = sid;
		this.si = si;
	}
	@Override
	public String toString() {
		return "Billdetll [btid=" + btid + ", btrdeTIme=" + btrdeTIme
				+ ", bcourse=" + bcourse + ", btrdeMoney=" + btrdeMoney
				+ ", bmyMoney=" + bmyMoney + ", bkImage=" + bkImage
				+ ", bkName=" + bkName + ", bkNumber=" + bkNumber
				+ ", orderTime=" + orderTime + ", sid=" + sid + ", bstode="
				+ bstode + ", si=" + si + "]";
	}
	public int getBtid() {
		return btid;
	}
	public void setBtid(int btid) {
		this.btid = btid;
	}
	public String getBtrdeTIme() {
		return btrdeTIme;
	}
	public void setBtrdeTIme(String btrdeTIme) {
		this.btrdeTIme = btrdeTIme;
	}
	public String getBcourse() {
		return bcourse;
	}
	public void setBcourse(String bcourse) {
		this.bcourse = bcourse;
	}
	public float getBtrdeMoney() {
		return btrdeMoney;
	}
	public void setBtrdeMoney(float btrdeMoney) {
		this.btrdeMoney = btrdeMoney;
	}
	public float getBmyMoney() {
		return bmyMoney;
	}
	public void setBmyMoney(float bmyMoney) {
		this.bmyMoney = bmyMoney;
	}
	public String getBkImage() {
		return bkImage;
	}
	public void setBkImage(String bkImage) {
		this.bkImage = bkImage;
	}
	public String getBkName() {
		return bkName;
	}
	public void setBkName(String bkName) {
		this.bkName = bkName;
	}
	public String getBkNumber() {
		return bkNumber;
	}
	public void setBkNumber(String bkNumber) {
		this.bkNumber = bkNumber;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Student_info getSi() {
		return si;
	}
	public void setSi(Student_info si) {
		this.si = si;
	}
	public int getBstode() {
		return bstode;
	}
	public void setBstode(int bstode) {
		this.bstode = bstode;
	}
	
}
