package com.savarino.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savarino.entities.Acquisto;

public interface AcquistoDAO extends JpaRepository<Acquisto, Integer> {

}
