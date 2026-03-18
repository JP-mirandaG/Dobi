package com.senai.infoa.dobi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.dobi.repositories.AlunoRepository;

@Service
public class AlunoService {
    
    @Autowired
    private AlunoRepository alunoRepository;

    
}
