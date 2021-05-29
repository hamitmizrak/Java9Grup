package com.ecodation.interfacex;

// POJO inheritance
// abstract
public abstract class AyniOrtakOzellikler {
	
	private int serialId;
	private String marka;
	private String renk;
	
	public AyniOrtakOzellikler() {
		// TODO Auto-generated constructor stub
	}
	
	public AyniOrtakOzellikler(int serialId, String marka, String renk) {
		this.serialId = serialId;
		this.marka = marka;
		this.renk = renk;
	}
	
	public void govdeliMetot() {
		System.out.println("gövdeli metot");
	}
	
	public abstract void govdesizMetot(String renk);
	
	// getter and setter
	public int getSerialId() {
		return serialId;
	}
	
	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	public String getRenk() {
		return renk;
	}
	
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	@Override
	public String toString() {
		return "AyniOrtakOzellikler [serialId=" + serialId + ", marka=" + marka + ", renk=" + renk + "]";
	}
	
}
