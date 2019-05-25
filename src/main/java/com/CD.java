package com;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
@Component
public class CD {
    public int id;
    public void play(){
        System.out.println("play CD");
    }
    public CD(){}
}
