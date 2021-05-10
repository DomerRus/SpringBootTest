package ru.ityce4ka.userservice.repository;

import ru.ityce4ka.userservice.model.RoleModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleModel, Long> {
    RoleModel findByName(String name);
}