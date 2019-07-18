package com.tw.apistackbase.repo;

import com.tw.apistackbase.theCase.Case;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CaseRepository extends JpaRepository<Case, Integer> {

    List<Case> findAllByOrderByHappenedTimeDesc();

    List<Case> findAllByNameIsLike(String name);

}
