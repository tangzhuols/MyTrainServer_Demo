package com.xq.vo;

public class IdleTrain {//��������ʱ���
	private int itid;
	private String itime;
	private int isahgnwu;
	private int ixiawu;
	private int iwanshang;
	private int tid;
	private Instructor instructor;
	public IdleTrain(String itime, int isahgnwu, int ixiawu, int iwanshang,
			int tid, Instructor instructor) {
		super();
		this.itime = itime;
		this.isahgnwu = isahgnwu;
		this.ixiawu = ixiawu;
		this.iwanshang = iwanshang;
		this.tid = tid;
		this.instructor = instructor;
	}

	public IdleTrain(String itime, int isahgnwu, int ixiawu, int iwanshang, int tid) {
		this.itime = itime;
		this.isahgnwu = isahgnwu;
		this.ixiawu = ixiawu;
		this.iwanshang = iwanshang;
		this.tid = tid;
	}

	public IdleTrain(int itid, String itime, int isahgnwu, int ixiawu,
					 int iwanshang, int tid, Instructor instructor) {
		super();
		this.itid = itid;
		this.itime = itime;
		this.isahgnwu = isahgnwu;
		this.ixiawu = ixiawu;
		this.iwanshang = iwanshang;
		this.tid = tid;
		this.instructor = instructor;
	}
	@Override
	public String toString() {
		return "IdleTrain [itid=" + itid + ", itime=" + itime + ", isahgnwu="
				+ isahgnwu + ", ixiawu=" + ixiawu + ", iwanshang=" + iwanshang
				+ ", tid=" + tid + ", is=" + instructor + "]";
	}
	public int getItid() {
		return itid;
	}
	public void setItid(int itid) {
		this.itid = itid;
	}
	public String getItime() {
		return itime;
	}
	public void setItime(String itime) {
		this.itime = itime;
	}
	public int getIsahgnwu() {
		return isahgnwu;
	}
	public void setIsahgnwu(int isahgnwu) {
		this.isahgnwu = isahgnwu;
	}
	public int getIxiawu() {
		return ixiawu;
	}
	public void setIxiawu(int ixiawu) {
		this.ixiawu = ixiawu;
	}
	public int getIwanshang() {
		return iwanshang;
	}
	public void setIwanshang(int iwanshang) {
		this.iwanshang = iwanshang;
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
}
