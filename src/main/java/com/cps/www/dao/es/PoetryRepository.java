package com.cps.www.dao.es;

import com.cps.www.entity.Poetry;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface PoetryRepository extends ElasticsearchRepository<Poetry, String> { // 泛型1：实体泛型 2：主键

    /**
     * 查询名字是ls 年龄是20岁的用户
     */
    //public List<PoetryController> findByNameAndAge(String name, Integer age);

    /**
     * 查询工资在2000~8000元之间的用户
     */
    // public List<PoetryController> findBySalaryBetween(int start, int end);


    /**
     * select * from where xxx order by xxx
     * <p>
     * 查询名字以z开头的相关用户 并且按照工资降序排列
     */
    //public List<PoetryController> findByNameStartingWithOrderBySalaryAsc(String prefix);
}
