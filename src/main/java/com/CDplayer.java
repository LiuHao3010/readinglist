package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CDplayer {
    public CD cd;
    public CD getCd(){
        return this.cd;
    }
    public CDplayer(CD cd){
        this.cd=cd;
    }
    //@Autowired
    public void setCd(CD cd){
        this.cd=cd;
    }
    public void playCD(){
        cd.play();
    }
}
