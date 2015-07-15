package com.ai.bootframe;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.perf4j.aop.Profiled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ai.service.IFreeResourceQuery;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:business-consumer.xml")
public class ProviderTest {
	
	@Autowired
	private IFreeResourceQuery query;
//	@Autowired
//	private RedisTemplate<String, String> redisTemplate;

	/**
	 * 1、测试dubbo服务
	 * 2、实际使用可以参考这个写法
	 */
	@Test 
	public void freeResourceQueryTest() {
		try {
			query.queryFreeResource();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	@Test
	public void redisTest(){
		
	}
	
}
