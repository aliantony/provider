package com.test.dubbo.provider;

import org.springframework.stereotype.Service;

@Service("testRegistryService")  
public class TestRegistryServiceImpl implements TestRegistryService {  
    
    public String hello(String name) {    
        return "provider reseponse .... "+name;  
    }  
}  