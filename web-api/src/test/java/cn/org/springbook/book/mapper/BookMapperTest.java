package cn.org.springbook.book.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author 戴志勇
 */
@SpringBootTest
class BookMapperTest {


    @Resource
    private BookMapper bookMapper;

    @Test
    void select() {
        int count = bookMapper.select();
        assertThat(count).isEqualTo(0);
    }
}