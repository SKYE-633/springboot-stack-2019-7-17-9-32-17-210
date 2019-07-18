package com.tw.apistackbase.service;

import com.tw.apistackbase.repo.CaseCompositionRepository;
import com.tw.apistackbase.theCase.CaseComposition;
import com.tw.apistackbase.judge.ObjectJudge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseCompositionService {

    @Autowired
    private CaseCompositionRepository caseCompositionRepository;

    public CaseComposition save(CaseComposition caseComposition) throws Exception {
        if (!ObjectJudge.isObjectNull(caseComposition, "id")) {
            return caseCompositionRepository.save(caseComposition);
        }
        return null;
    }

    public List<CaseComposition> findByExample(CaseComposition caseComposition){
        //return caseCompositionRepository.findAllByExample(caseComposition);
        return null;
    }
}
