package cn.org.springbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 戴志勇
 */
@SpringBootApplication
//@MapperScans(value = {
//        @MapperScan("cn.org.springbook.book.mapper")
//})
@MapperScan(basePackages = {"cn.org.springbook.book.mapper"})
public class SpringBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBookApplication.class, args);
    }
}
