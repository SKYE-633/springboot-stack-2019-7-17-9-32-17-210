package com.tw.apistackbase.repo;

import com.tw.apistackbase.theCase.CaseComposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseCompositionRepository extends JpaRepository<CaseComposition, Integer> {
}
