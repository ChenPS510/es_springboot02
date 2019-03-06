package com.cps.www.respository;

import com.cps.www.entity.Poetry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.elasticsearch.index.query.QueryBuilders.matchQuery;

// 静态导入

@Repository
public class CustomPoetryRepositoryImpl implements CustomPoetryRepository {
    @Autowired
    private ElasticsearchTemplate template;

    @Override
    public List<Poetry> search(String type, String key) {
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(matchQuery(type, key))
                .build();
        System.out.println(searchQuery.getQuery());

        List<Poetry> poetries = template.queryForList(searchQuery, Poetry.class);

        return poetries;
    }
}






























