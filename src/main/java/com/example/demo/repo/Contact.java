package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ContactDTO;

public interface Contact extends JpaRepository<ContactDTO, Long> {
	

}
