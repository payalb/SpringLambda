package com.example.demo;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import org.springframework.stereotype.Component;

@Component
public class MyHandler extends SpringBootRequestHandler<String, String>{

}
