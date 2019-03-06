package com.cps.www.service.impl;

import com.cps.www.entity.Poetry;
import com.cps.www.respository.CustomPoetryRepository;
import com.cps.www.service.PoetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoetryServiceImpl implements PoetryService {
    @Autowired
    private CustomPoetryRepository repository;

    @Override
    public List<Poetry> selectByTitle(String type, String key) {
        List<Poetry> list = repository.search(type, key);
        list.forEach(v -> System.out.println(v));
        return list;
    }
}
