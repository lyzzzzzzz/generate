package com.lyz.makeupMall.mapper;

import com.lyz.makeupMall.domain.User;
import com.lyz.makeupMall.domain.UserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<User> {
    long countByExample(UserCriteria example);

    int deleteByExample(UserCriteria example);

    List<User> selectByExample(UserCriteria example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserCriteria example);

    int updateByExample(@Param("record") User record, @Param("example") UserCriteria example);
}