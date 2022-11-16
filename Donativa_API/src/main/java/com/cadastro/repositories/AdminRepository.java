package com.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cadastro.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
