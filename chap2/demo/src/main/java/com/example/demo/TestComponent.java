package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestComponent {
    private final ApplicationEventPublisher applicationEventPublisher;

    @Autowired
    public TestComponent(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @PostConstruct
    public void run(){
        applicationEventPublisher.publishEvent(new MyEvent(this,100));
    }

}
