package com.geekshow.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.geekshow.Application;
import com.geekshow.sender.Sender;

/**
 * 消息队列测试类
 * @author Administrator
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class QueueTest {

	@Autowired
	private Sender sender;
	
	/*
	 * 测试消息队列
	 */
	@Test
	public void test1(){
		
		while (true) {
			this.sender.send("Hello RabbitMQ");
		}
	}
}
