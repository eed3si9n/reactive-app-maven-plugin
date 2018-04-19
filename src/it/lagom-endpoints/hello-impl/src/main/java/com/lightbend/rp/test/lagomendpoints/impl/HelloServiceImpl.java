package com.lightbend.rp.test.lagomendpoints.impl;

import com.lightbend.rp.test.lagomendpoints.api.HelloService;

import com.lightbend.lagom.javadsl.api.ServiceCall;
import akka.NotUsed;
import java.util.concurrent.CompletableFuture;

public class HelloServiceImpl implements HelloService {
    @Override
    public ServiceCall<NotUsed, String> hello(String id) {
        //return request -> {
        //    return "Hello, " + id;
        //};
        return request -> CompletableFuture.completedFuture("hello: " + id);
    }
}