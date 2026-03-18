package com.senai.infoa.dobi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.infoa.dobi.repositories.InstrutorRepository;

@Service
public class InstrutorService {
    
    @Autowired
    private InstrutorRepository instrutorRepository;
}
