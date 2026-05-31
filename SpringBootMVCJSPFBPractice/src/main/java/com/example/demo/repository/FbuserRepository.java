package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Fbuser;

public interface FbuserRepository extends JpaRepository<Fbuser, Integer>
{
	Fbuser findByEmail(String email);
}
