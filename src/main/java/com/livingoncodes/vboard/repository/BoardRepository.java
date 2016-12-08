package com.livingoncodes.vboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livingoncodes.vboard.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {

	// By defining this, the methos will be implemented by Spring Data
	// it sees an entity of this name "name" and uses it
	public Board findByName(String name);
}