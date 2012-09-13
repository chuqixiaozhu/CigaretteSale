package com.etc.geeks.entity.SystemManagement;

public class UserGroup {

	private String userGroupId;//用户组ID
	private String authorityId;//权限ID
	private String userGroupName;//用户组名称
	public String getSuserGroupId() {
		return userGroupId;
	}
	public void setSuserGroupId(String suserGroupId) {
		this.userGroupId = suserGroupId;
	}
	public String getAuthorityId() {
		return authorityId;
	}
	public void setAuthorityId(String authorityId) {
		this.authorityId = authorityId;
	}
	public String getUserGroupName() {
		return userGroupName;
	}
	public void setUserGroupName(String userGroupName) {
		this.userGroupName = userGroupName;
	}
	@Override
	public String toString() {
		return "UserGroup [authorityId=" + authorityId + ", suserGroupId="
				+ userGroupId + ", userGroupName=" + userGroupName + "]";
	}
	public UserGroup(String suserGroupId, String authorityId,
			String userGroupName) {
		super();
		this.userGroupId = suserGroupId;
		this.authorityId = authorityId;
		this.userGroupName = userGroupName;
	}
	public UserGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
