package com.tw.apistackbase.repo;

import com.tw.apistackbase.theCase.Inquisitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InquisitorRepository extends JpaRepository<Inquisitor, Integer> {
}
