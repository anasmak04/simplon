package com.project.Br13.security;
import com.google.common.collect.Sets;
import java.util.Set;


public enum ApplicationUserRole {
	ADMIN(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,ApplicationUserPermission.COURSE_WRITE,ApplicationUserPermission.STUDENT_READ,ApplicationUserPermission.STUDENT_WRITE)),
	VISITOR(Sets.newHashSet());

	private final Set<ApplicationUserPermission> permissions;

	private ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
		this.permissions = permissions;
	}
		
	public Set<ApplicationUserPermission> getPermissions() {
		return permissions;
	}
}
