package com.skb.demo;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BaseApiTest.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
public class BaseApiTest {

}
