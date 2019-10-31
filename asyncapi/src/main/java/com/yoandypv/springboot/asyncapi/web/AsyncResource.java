package com.yoandypv.springboot.asyncapi.web;

import com.yoandypv.springboot.asyncapi.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class AsyncResource {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/api/async")
    private Flux<String> callSync(){

        long t1= System.currentTimeMillis();
        Mono<String> a = asyncService.operationA();
        Mono<String> b = asyncService.operationB();
        long t2= System.currentTimeMillis();
        long total = t2 -t1;
        Flux<String> nums = Flux.concat(a,b);

        System.out.println("total" + total);
        return nums;

    }
}
