package com.xq.vo;

public class Instructor {// ������
	private int tid;
	private String tuName;
	private String trName;
	private String trpwd;
	private String trImage;
	private float trdecide;
	private String traddress;
	private String trphone;
	private int trjage;

	public Instructor() {
		super();
	}

	public Instructor(String tuName, String trName, String trpwd,
			String trImage, float trdecide, String traddress, String trphone,
			int trjage) {
		super();
		this.tuName = tuName;
		this.trName = trName;
		this.trpwd = trpwd;
		this.trImage = trImage;
		this.trdecide = trdecide;
		this.traddress = traddress;
		this.trphone = trphone;
		this.trjage = trjage;
	}

	public Instructor(int tid, String tuName, String trName, String trpwd,
			String trImage, float trdecide, String traddress, String trphone,
			int trjage) {
		super();
		this.tid = tid;
		this.tuName = tuName;
		this.trName = trName;
		this.trpwd = trpwd;
		this.trImage = trImage;
		this.trdecide = trdecide;
		this.traddress = traddress;
		this.trphone = trphone;
		this.trjage = trjage;
	}

	@Override
	public String toString() {
		return "Instructor [tid=" + tid + ", tuName=" + tuName + ", trName="
				+ trName + ", trpwd=" + trpwd + ", trImage=" + trImage
				+ ", trdecide=" + trdecide + ", traddress=" + traddress
				+ ", trphone=" + trphone + ", trjage=" + trjage + "]";
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTuName() {
		return tuName;
	}

	public void setTuName(String tuName) {
		this.tuName = tuName;
	}

	public String getTrName() {
		return trName;
	}

	public void setTrName(String trName) {
		this.trName = trName;
	}

	public String getTrpwd() {
		return trpwd;
	}

	public void setTrpwd(String trpwd) {
		this.trpwd = trpwd;
	}

	public String getTrImage() {
		return trImage;
	}

	public void setTrImage(String trImage) {
		this.trImage = trImage;
	}

	public float getTrdecide() {
		return trdecide;
	}

	public void setTrdecide(float trdecide) {
		this.trdecide = trdecide;
	}

	public String getTraddress() {
		return traddress;
	}

	public void setTraddress(String traddress) {
		this.traddress = traddress;
	}

	public String getTrphone() {
		return trphone;
	}

	public void setTrphone(String trphone) {
		this.trphone = trphone;
	}

	public int getTrjage() {
		return trjage;
	}

	public void setTrjage(int trjage) {
		this.trjage = trjage;
	}

}
