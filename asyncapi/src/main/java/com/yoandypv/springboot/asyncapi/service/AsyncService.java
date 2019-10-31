package com.yoandypv.springboot.asyncapi.service;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import java.time.Duration;

@Service
public class AsyncService {

    public Mono<String> operationA(){
        return Mono.just("Operation A").delayElement(Duration.ofSeconds(2));
    }

    public Mono<String> operationB(){
        return Mono.just("Operation B").delayElement(Duration.ofSeconds(2)) ;
    }

}
