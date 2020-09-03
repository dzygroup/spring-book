package cn.org.springbook.book.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author 戴志勇
 */
@Mapper
public interface BookMapper {

    //    @Select("select count(*) from book")
    int select();


}
