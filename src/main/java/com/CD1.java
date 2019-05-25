package com;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.lang.annotation.Repeatable;

@Component
@Profile("mac")
public class CD1 extends CD {
    public void play(){
        System.out.println("play CD1");
    }
}
