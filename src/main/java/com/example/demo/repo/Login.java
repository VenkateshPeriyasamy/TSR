package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.LoginDTO;

public interface Login extends JpaRepository<LoginDTO, Long> {
	LoginDTO findByUsername(String username);

}
