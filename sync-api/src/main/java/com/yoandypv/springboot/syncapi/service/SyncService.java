package com.yoandypv.springboot.syncapi.service;

import org.springframework.stereotype.Service;

@Service
public class SyncService {

    public String operationA(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation A";
    }

    public String operationB(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Operation B";
    }

}
