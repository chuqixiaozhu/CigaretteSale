package com.etc.geeks.entity.SystemManagement;

public class Authority {

	private String authorityId;         //权限ID
	private String authorityName;       //权限名称
	public String getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}
	public String getAuthorityName() {
		return authorityName;
	}
	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}
	@Override
	public String toString() {
		return "Authority [authorityId=" + authorityId + ", authorityName="
				+ authorityName + "]";
	}
	public Authority(String authorityId, String authorityName) {
		super();
		this.authorityId = authorityId;
		this.authorityName = authorityName;
	}
	public Authority() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
