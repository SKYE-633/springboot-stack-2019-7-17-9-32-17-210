package com.tw.apistackbase.repo;

import com.tw.apistackbase.theCase.Procuratorate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcuratorateRepository extends JpaRepository<Procuratorate, Integer> {
}
