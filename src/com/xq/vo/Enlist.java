package com.xq.vo;

public class Enlist {// ������
	private int eid;
	private String eName;
	private String ephone;
	private String eidNumber;
	private String eaddress;
	private String enumberTop;
	private String enumberbutoon;
	private float euMoney;
	private String eage;
	private float ecm;
	private float ekg;
	private float ebaomMoney;
	private float ekcMoney;
	private float ejzMoney;
	private float elyMoney;
	private float ejdMoney;
	private float ezcMoney;
	private float ezMoney;
	private float ezlMoney;
	private String eplace;
	private String ebTime;//����ʱ��
	private int sid;
	private String ezPian;
	private Student_info si;
	public Enlist() {
		super();
	}
	public Enlist(String eName, String ephone, String eidNumber,
			String eaddress, String enumberTop, String enumberbutoon,
			float euMoney, String eage, float ecm, float ekg, float ebaomMoney,
			float ekcMoney, float ejzMoney, float elyMoney, float ejdMoney,
			float ezcMoney, float ezMoney, float ezlMoney, String eplace,
			int sid, Student_info si) {
		super();
		this.eName = eName;
		this.ephone = ephone;
		this.eidNumber = eidNumber;
		this.eaddress = eaddress;
		this.enumberTop = enumberTop;
		this.enumberbutoon = enumberbutoon;
		this.euMoney = euMoney;
		this.eage = eage;
		this.ecm = ecm;
		this.ekg = ekg;
		this.ebaomMoney = ebaomMoney;
		this.ekcMoney = ekcMoney;
		this.ejzMoney = ejzMoney;
		this.elyMoney = elyMoney;
		this.ejdMoney = ejdMoney;
		this.ezcMoney = ezcMoney;
		this.ezMoney = ezMoney;
		this.ezlMoney = ezlMoney;
		this.eplace = eplace;
		this.sid = sid;
		this.si = si;
	}
	public Enlist(int eid, String eName, String ephone, String eidNumber,
			String eaddress, String enumberTop, String enumberbutoon,
			float euMoney, String eage, float ecm, float ekg, float ebaomMoney,
			float ekcMoney, float ejzMoney, float elyMoney, float ejdMoney,
			float ezcMoney, float ezMoney, float ezlMoney, String eplace,
			int sid, Student_info si) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.ephone = ephone;
		this.eidNumber = eidNumber;
		this.eaddress = eaddress;
		this.enumberTop = enumberTop;
		this.enumberbutoon = enumberbutoon;
		this.euMoney = euMoney;
		this.eage = eage;
		this.ecm = ecm;
		this.ekg = ekg;
		this.ebaomMoney = ebaomMoney;
		this.ekcMoney = ekcMoney;
		this.ejzMoney = ejzMoney;
		this.elyMoney = elyMoney;
		this.ejdMoney = ejdMoney;
		this.ezcMoney = ezcMoney;
		this.ezMoney = ezMoney;
		this.ezlMoney = ezlMoney;
		this.eplace = eplace;
		this.sid = sid;
		this.si = si;
	}
	@Override
	public String toString() {
		return "Enlist [eid=" + eid + ", eName=" + eName + ", ephone=" + ephone
				+ ", eidNumber=" + eidNumber + ", eaddress=" + eaddress
				+ ", enumberTop=" + enumberTop + ", enumberbutoon="
				+ enumberbutoon + ", euMoney=" + euMoney + ", eage=" + eage
				+ ", ecm=" + ecm + ", ekg=" + ekg + ", ebaomMoney="
				+ ebaomMoney + ", ekcMoney=" + ekcMoney + ", ejzMoney="
				+ ejzMoney + ", elyMoney=" + elyMoney + ", ejdMoney="
				+ ejdMoney + ", ezcMoney=" + ezcMoney + ", ezMoney=" + ezMoney
				+ ", ezlMoney=" + ezlMoney + ", eplace=" + eplace + ", ebTime="
				+ ebTime + ", sid=" + sid + ", si=" + si + "]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEphone() {
		return ephone;
	}
	public void setEphone(String ephone) {
		this.ephone = ephone;
	}
	public String getEidNumber() {
		return eidNumber;
	}
	public void setEidNumber(String eidNumber) {
		this.eidNumber = eidNumber;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getEnumberTop() {
		return enumberTop;
	}
	public void setEnumberTop(String enumberTop) {
		this.enumberTop = enumberTop;
	}
	public String getEnumberbutoon() {
		return enumberbutoon;
	}
	public void setEnumberbutoon(String enumberbutoon) {
		this.enumberbutoon = enumberbutoon;
	}
	public float getEuMoney() {
		return euMoney;
	}
	public void setEuMoney(float euMoney) {
		this.euMoney = euMoney;
	}
	public String getEage() {
		return eage;
	}
	public void setEage(String eage) {
		this.eage = eage;
	}
	public float getEcm() {
		return ecm;
	}
	public void setEcm(float ecm) {
		this.ecm = ecm;
	}
	public float getEkg() {
		return ekg;
	}
	public void setEkg(float ekg) {
		this.ekg = ekg;
	}
	public float getEbaomMoney() {
		return ebaomMoney;
	}
	public void setEbaomMoney(float ebaomMoney) {
		this.ebaomMoney = ebaomMoney;
	}
	public float getEkcMoney() {
		return ekcMoney;
	}
	public void setEkcMoney(float ekcMoney) {
		this.ekcMoney = ekcMoney;
	}
	public float getEjzMoney() {
		return ejzMoney;
	}
	public void setEjzMoney(float ejzMoney) {
		this.ejzMoney = ejzMoney;
	}
	public float getElyMoney() {
		return elyMoney;
	}
	public void setElyMoney(float elyMoney) {
		this.elyMoney = elyMoney;
	}
	public float getEjdMoney() {
		return ejdMoney;
	}
	public void setEjdMoney(float ejdMoney) {
		this.ejdMoney = ejdMoney;
	}
	public float getEzcMoney() {
		return ezcMoney;
	}
	public void setEzcMoney(float ezcMoney) {
		this.ezcMoney = ezcMoney;
	}
	public float getEzMoney() {
		return ezMoney;
	}
	public void setEzMoney(float ezMoney) {
		this.ezMoney = ezMoney;
	}
	public float getEzlMoney() {
		return ezlMoney;
	}
	public void setEzlMoney(float ezlMoney) {
		this.ezlMoney = ezlMoney;
	}
	public String getEplace() {
		return eplace;
	}
	public void setEplace(String eplace) {
		this.eplace = eplace;
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
	public String getEbTime() {
		return ebTime;
	}
	public void setEbTime(String ebTime) {
		this.ebTime = ebTime;
	}
	public String getEzPian() {
		return ezPian;
	}
	public void setEzPian(String ezPian) {
		this.ezPian = ezPian;
	}
	
}
