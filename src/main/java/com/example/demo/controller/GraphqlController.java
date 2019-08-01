package com.example.demo.controller;

import io.leangen.graphql.annotations.GraphQLId;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import org.springframework.stereotype.Component;

@GraphQLApi
@Component
public class GraphqlController {

    @GraphQLQuery(name = "gtest")
    public String gtest(){
        return "hello";
    }

    /**
     * 查詢寫法
     * @param id
     * @return
     */
    @GraphQLQuery(name = "test")
    public String test(@GraphQLId int id) {
        return "test" + id;
    }
}
