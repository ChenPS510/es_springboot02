package com.cps.www;

import com.cps.www.dao.PoetryMapper;
import com.cps.www.dao.es.PoetryRepository;
import com.cps.www.entity.Poetry;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsSpringboot02ApplicationTests {

    @Autowired
    private PoetryRepository repository;

    @Autowired
    private PoetryMapper poetryMapper;

    @Test
    public void contextLoads() {
        Iterable<Poetry> lists = repository.findAll();

        lists.forEach(v -> System.out.println(v));
    }

    // 测试插入
    @Test
    public void testSave() {
        repository.save(new Poetry("6000", "157", "title666", new Date(), new Date(), "巴拉巴拉巴拉巴拉"));
    }

    // 将数据库中的数据 添加至索引 /lucene/poetries
    @Test
    public void test1() {
        List<Poetry> poetries = poetryMapper.selectAllPoetries();
        poetries.forEach(v -> System.out.println(v));
        repository.saveAll(poetries);
    }

    @Test
    public void test2() {
        Optional<Poetry> id = repository.findById("1");

        System.out.println(id);
    }


}
