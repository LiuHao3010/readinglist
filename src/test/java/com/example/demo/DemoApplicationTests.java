package com.example.demo;

import com.CDplayer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	CDplayer cDplayer;
	@Autowired
	CDplayer cDplayer1;
	@Test
	public void contextLoads() {
	cDplayer.playCD();
	cDplayer.cd.id=2;
	//
		System.out.println(cDplayer1.cd.id);
	}
}
