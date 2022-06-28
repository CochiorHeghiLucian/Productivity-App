package com.hgi.javaapp.repository;

import com.hgi.javaapp.model.Role;
import com.hgi.javaapp.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
