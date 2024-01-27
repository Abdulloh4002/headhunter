package org.example.headhunterapplication.repository;

import org.example.headhunterapplication.entity.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
}
