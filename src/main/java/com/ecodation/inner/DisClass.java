package com.ecodation.inner;

public class DisClass {
	// dış class
	private String disStr = "Merhabalar Dış class";
	
	public String getDisStr() {
		System.out.println(this.disStr);
		return disStr;
	}
	
	public void setDisStr(String disStr) {
		this.disStr = disStr;
	}
	
	// iç class-1
	public class IcClass1 {
		
		private String icStr1 = "Merhabalar iç class -1";
		
		public String getIcStr() {
			System.out.println(this.icStr1);
			return icStr1;
		}
		
		public void setIcStr(String icStr1) {
			this.icStr1 = icStr1;
		}
		
		// iç class-2
		public class IcClass2 {
			private String icStr2 = "Merhabalar iç class -2";
			
			public String getIcStr2() {
				System.out.println(this.icStr2);
				return icStr2;
			}
			
			public void setIcStr2(String icStr2) {
				this.icStr2 = icStr2;
			}
			
		}
		
	}
	
}
