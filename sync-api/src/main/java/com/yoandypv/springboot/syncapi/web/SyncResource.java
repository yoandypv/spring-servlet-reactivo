package com.yoandypv.springboot.syncapi.web;

import com.yoandypv.springboot.syncapi.service.SyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SyncResource {

    @Autowired
    private SyncService syncService;


    @GetMapping("/api/sync")
    private String callSync(){

        long t1= System.currentTimeMillis();
        String a = syncService.operationA();
        String b = syncService.operationB();
        String result = a + b;
        long t2= System.currentTimeMillis();
        long total = t2 - t1;
        System.out.println("Total " + total);
        return result;

    }

}
