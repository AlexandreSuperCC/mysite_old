package cn.luischen;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySiteApplicationTests {

	@Test
	public void contextLoads() {
		long cur = System.currentTimeMillis() / 1000;
		System.out.println(cur);
	}

	@Test
	public void test(){
		Stream.of("first","second","third").map(String::toUpperCase).forEach(System.out::println);
	}

}
