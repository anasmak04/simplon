package com.project.Br13.security;

public enum ApplicationUserPermission {
	STUDENT_READ("student:read"), STUDENT_WRITE("student:write"), COURSE_READ("course:write"),
	COURSE_WRITE("course:write");

	private final String permission;

	ApplicationUserPermission(String permission) {
		this.permission = permission;
	}

	public String getPermission() {
		return permission;
	}

}