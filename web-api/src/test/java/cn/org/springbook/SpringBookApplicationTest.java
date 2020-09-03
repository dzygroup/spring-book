package cn.org.springbook;

import cn.org.springbook.book.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author 戴志勇
 */
@SpringBootTest
class SpringBookApplicationTest {


    @Resource
    private BookMapper bookMapper;

    @Test
    void name() {
        bookMapper.select();
    }
}