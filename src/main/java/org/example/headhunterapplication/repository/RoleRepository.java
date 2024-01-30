package org.example.headhunterapplication.repository;

import org.example.headhunterapplication.entity.Permission;
import org.example.headhunterapplication.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {



}
