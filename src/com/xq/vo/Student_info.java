package com.xq.vo;

public class Student_info {// ѧԱ��
    //public static final String Http_TOP = "http://10.0.2.154:8080";
    public static final String Http_TOP = "http:// 192.168.1.105:8080";
    public static final String Http_PAHT = Http_TOP + "/OriginDrive/mvc/";
    private int sid;
    private String siName;
    private String siuerName;
    private String siuImage;
    private String sijiaozhaolx;
    private String siage;
    private String siuaddress;
    private String sipwd;
    private String siuerSFZ;
    private String siuJAddress;
    private String siuGAddress;
    private Enlist e;
    private Billdetll b;


    public Student_info() {
        super();
    }


    public Student_info(int sid, String siName, String siuerName,
                        String siuImage, String sijiaozhaolx, String siage,
                        String siuaddress, String sipwd, String siuerSFZ,
                        String siuJAddress, String siuGAddress) {
        super();
        this.sid = sid;
        this.siName = siName;
        this.siuerName = siuerName;
        this.siuImage = siuImage;
        this.sijiaozhaolx = sijiaozhaolx;
        this.siage = siage;
        this.siuaddress = siuaddress;
        this.sipwd = sipwd;
        this.siuerSFZ = siuerSFZ;
        this.siuJAddress = siuJAddress;
        this.siuGAddress = siuGAddress;
    }


    public Student_info(String siName, String siuerName, String siuImage,
                        String sijiaozhaolx, String siage, String siuaddress, String sipwd,
                        String siuerSFZ, String siuJAddress, String siuGAddress) {
        super();
        this.siName = siName;
        this.siuerName = siuerName;
        this.siuImage = siuImage;
        this.sijiaozhaolx = sijiaozhaolx;
        this.siage = siage;
        this.siuaddress = siuaddress;
        this.sipwd = sipwd;
        this.siuerSFZ = siuerSFZ;
        this.siuJAddress = siuJAddress;
        this.siuGAddress = siuGAddress;
    }


    @Override
    public String toString() {
        return "Student_info [sid=" + sid + ", siName=" + siName
                + ", siuerName=" + siuerName + ", siuImage=" + siuImage
                + ", sijiaozhaolx=" + sijiaozhaolx + ", siage=" + siage
                + ", siuaddress=" + siuaddress + ", sipwd=" + sipwd
                + ", siuerSFZ=" + siuerSFZ + ", siuJAddress=" + siuJAddress
                + ", siuGAddress=" + siuGAddress + ", e=" + e + ", b=" + b
                + "]";
    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSiName() {
        return siName;
    }

    public void setSiName(String siName) {
        this.siName = siName;
    }

    public String getSiuerName() {
        return siuerName;
    }

    public void setSiuerName(String siuerName) {
        this.siuerName = siuerName;
    }

    public String getSiuImage() {
        return siuImage;
    }

    public void setSiuImage(String siuImage) {
        this.siuImage = siuImage;
    }

    public String getSijiaozhaolx() {
        return sijiaozhaolx;
    }

    public void setSijiaozhaolx(String sijiaozhaolx) {
        this.sijiaozhaolx = sijiaozhaolx;
    }

    public String getSiage() {
        return siage;
    }

    public void setSiage(String siage) {
        this.siage = siage;
    }

    public String getSiuaddress() {
        return siuaddress;
    }

    public void setSiuaddress(String siuaddress) {
        this.siuaddress = siuaddress;
    }

    public String getSipwd() {
        return sipwd;
    }

    public void setSipwd(String sipwd) {
        this.sipwd = sipwd;
    }


    public String getSiuerSFZ() {
        return siuerSFZ;
    }


    public void setSiuerSFZ(String siuerSFZ) {
        this.siuerSFZ = siuerSFZ;
    }


    public String getSiuJAddress() {
        return siuJAddress;
    }


    public void setSiuJAddress(String siuJAddress) {
        this.siuJAddress = siuJAddress;
    }


    public String getSiuGAddress() {
        return siuGAddress;
    }


    public void setSiuGAddress(String siuGAddress) {
        this.siuGAddress = siuGAddress;
    }


    public Enlist getE() {
        return e;
    }


    public void setE(Enlist e) {
        this.e = e;
    }


    public Billdetll getB() {
        return b;
    }


    public void setB(Billdetll b) {
        this.b = b;
    }


}
