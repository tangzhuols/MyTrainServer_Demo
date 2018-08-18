package com.xq.vo;

public class BesPock {//预约锟斤拷锟斤拷锟�
	private int Bid;
	private String byuyuezt;
	private String bsubject;
	private String bserveTime;
	private String place;
	private String bphone;
	private float bmoney;
	private String borderTime;
	private float bgMoney;
	private String bpayzt;
	private int byyTab;
	private int bcmTime;
	private int sid;
	private int tid;
	private Instructor instructor;
	private Student_info si;

	public BesPock() {
		super();
	}

	public BesPock(String byuyuezt, String bsubject, String bserveTime,
			String place, String bphone, float bmoney, String borderTime,
			float bgMoney, String bpayzt, int byyTab, int bcmTime, int sid,
			int tid, Instructor instructor, Student_info si) {
		super();
		this.byuyuezt = byuyuezt;
		this.bsubject = bsubject;
		this.bserveTime = bserveTime;
		this.place = place;
		this.bphone = bphone;
		this.bmoney = bmoney;
		this.borderTime = borderTime;
		this.bgMoney = bgMoney;
		this.bpayzt = bpayzt;
		this.byyTab = byyTab;
		this.bcmTime = bcmTime;
		this.sid = sid;
		this.tid = tid;
		this.instructor = instructor;
		this.si = si;
	}

	public BesPock(int bid, String byuyuezt, String bsubject,
			String bserveTime, String place, String bphone, float bmoney,
			String borderTime, float bgMoney, String bpayzt, int byyTab,
			int bcmTime, int sid, int tid, Instructor instructor,
			Student_info si) {
		super();
		Bid = bid;
		this.byuyuezt = byuyuezt;
		this.bsubject = bsubject;
		this.bserveTime = bserveTime;
		this.place = place;
		this.bphone = bphone;
		this.bmoney = bmoney;
		this.borderTime = borderTime;
		this.bgMoney = bgMoney;
		this.bpayzt = bpayzt;
		this.byyTab = byyTab;
		this.bcmTime = bcmTime;
		this.sid = sid;
		this.tid = tid;
		this.instructor = instructor;
		this.si = si;
	}

	@Override
	public String toString() {
		return "BesPock [Bid=" + Bid + ", byuyuezt=" + byuyuezt + ", bsubject="
				+ bsubject + ", bserveTime=" + bserveTime + ", place=" + place
				+ ", bphone=" + bphone + ", bmoney=" + bmoney + ", borderTime="
				+ borderTime + ", bgMoney=" + bgMoney + ", bpayzt=" + bpayzt
				+ ", byyTab=" + byyTab + ", bcmTime=" + bcmTime + ", sid="
				+ sid + ", tid=" + tid + ", instructor=" + instructor + ", si="
				+ si + "]";
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getByuyuezt() {
		return byuyuezt;
	}

	public void setByuyuezt(String byuyuezt) {
		this.byuyuezt = byuyuezt;
	}

	public String getBsubject() {
		return bsubject;
	}

	public void setBsubject(String bsubject) {
		this.bsubject = bsubject;
	}

	public String getBserveTime() {
		return bserveTime;
	}

	public void setBserveTime(String bserveTime) {
		this.bserveTime = bserveTime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getBphone() {
		return bphone;
	}

	public void setBphone(String bphone) {
		this.bphone = bphone;
	}

	public float getBmoney() {
		return bmoney;
	}

	public void setBmoney(float bmoney) {
		this.bmoney = bmoney;
	}

	public String getBorderTime() {
		return borderTime;
	}

	public void setBorderTime(String borderTime) {
		this.borderTime = borderTime;
	}

	public float getBgMoney() {
		return bgMoney;
	}

	public void setBgMoney(float bgMoney) {
		this.bgMoney = bgMoney;
	}

	public String getBpayzt() {
		return bpayzt;
	}

	public void setBpayzt(String bpayzt) {
		this.bpayzt = bpayzt;
	}

	public int getByyTab() {
		return byyTab;
	}

	public void setByyTab(int byyTab) {
		this.byyTab = byyTab;
	}

	public int getBcmTime() {
		return bcmTime;
	}

	public void setBcmTime(int bcmTime) {
		this.bcmTime = bcmTime;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Student_info getSi() {
		return si;
	}

	public void setSi(Student_info si) {
		this.si = si;
	}
	
}
